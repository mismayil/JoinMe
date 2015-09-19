package join.me.joinme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import join.me.joinme.model.JoinMeActivity;

/**
 * Created by Daniel on 2015-09-19.
 */
public class CustomActivityListAdapter extends ArrayAdapter<JoinMeActivity> {

    CustomActivityListAdapter(Context context, ArrayList<JoinMeActivity> activities) {
        super(context, R.layout.home_custom_list_row, activities);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.home_custom_list_row, parent, false);

        TextView activityText =  (TextView) customView.findViewById(R.id.activityText);
        TextView addressText = (TextView) customView.findViewById(R.id.addressText);
        ImageButton profilePicButton = (ImageButton) customView.findViewById(R.id.profilePicButton);
        Button joinButton = (Button) customView.findViewById(R.id.joinButton);
        Button cheerButton = (Button) customView.findViewById(R.id.cheerButton);

        joinButton.setText("Join Me!");
        cheerButton.setText(getItem(position).getCheers().size());
        activityText.setText(getItem(position).getAction());
        addressText.setText(getItem(position).getAction());
        profilePicButton.setImageBitmap(getItem(position).getOwner().getProfilePic());
        return super.getView(position, convertView, parent);
    }
}

