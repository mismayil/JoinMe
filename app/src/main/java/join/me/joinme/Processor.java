package join.me.joinme;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import join.me.joinme.model.AsyncResponse;
import join.me.joinme.model.JoinMeActivity;
import join.me.joinme.model.User;

public class Processor extends Activity {

    public static final String BASE_URL = "http://elailai94.me/htn_joinme/";
    public static final String ADD_USER = "add-user.php?";
    public static final String GET_USER = "get-user.php?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processor);
        Bundle bundle = getIntent().getExtras();
        String userid = bundle.getString("userid");
        String firstname = bundle.getString("firstname");
        String lastname = bundle.getString("lastname");
        String gender = bundle.getString("gender");
        User user = new User(userid,firstname, lastname, gender, new ArrayList<JoinMeActivity>());
        saveUser(user);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_processor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void saveUser(User user) {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            String url = BASE_URL + ADD_USER + "userid=" + user.getUserid() + "&" + "firstname=" + user.getFirstname() + "&" + "lastname=" + user.getLastname() + "&" + "gender=" + user.getGender();
            SendDataTask sendDataTask = new SendDataTask(new AsyncResponse() {
                @Override
                public void processFinish(String output) {
                    try {
                        JSONObject jsonObject = new JSONObject(output);
                        Log.v("response", jsonObject.getString("Status"));
                        Log.v("response", jsonObject.getString("Message"));
                    } catch (Exception e) {

                    }

                }
            });

            sendDataTask.execute(url);
        }
    }



    public static void alertMessage(String msg, Context ctx) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setMessage(msg);
        builder.setPositiveButton(R.string.btn_ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

class SendDataTask extends AsyncTask<String, Void, String> {

    public AsyncResponse asyncResponse = null;

    public SendDataTask(AsyncResponse asyncResponse) {
        this.asyncResponse = asyncResponse;
    }

    @Override
    protected String doInBackground(String... urls) {
        String json = null;

        try {
            URL urlObj = null;
            HttpURLConnection con = null;
            int response = 200;

            for (int i = 0; i < urls.length; i++) {
                urlObj = new URL(urls[i]);
                con = (HttpURLConnection) urlObj.openConnection();
                con.setRequestMethod("GET");
                response = con.getResponseCode();
                BufferedReader buf = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuffer sbuf = new StringBuffer();
                String output;
                while ((output = buf.readLine()) != null) {
                    sbuf.append(output);
                }
                json = sbuf.toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return json;
    }

    @Override
    protected void onPostExecute(String result) {
        asyncResponse.processFinish(result);
    }
}
