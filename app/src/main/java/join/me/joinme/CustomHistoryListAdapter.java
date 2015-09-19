package join.me.joinme;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import join.me.joinme.model.JoinMeActivity;

/**
 * Created by Daniel on 2015-09-19.
 */
public class CustomHistoryListAdapter extends ArrayAdapter<JoinMeActivity> {
    CustomHistoryListAdapter(Context context, ArrayList<JoinMeActivity> activities) {
        super(context, R.layout.home_custom_list_row, activities);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.profile_custom_list_row, parent, false);

        TextView activityText =  (TextView) customView.findViewById(R.id.activityTextHistory);
        TextView addressText = (TextView) customView.findViewById(R.id.addressTextHistory);
        ImageButton profilePicButton = (ImageButton) customView.findViewById(R.id.profilePicButtonHistory);
        TextView joinNumberText =  (TextView) customView.findViewById(R.id.joinNumberText);
        TextView cheerNumberText = (TextView) customView.findViewById(R.id.cheerNumberText);

        joinNumberText.setText(getItem(position).getBuddies().size());
        cheerNumberText.setText(getItem(position).getCheers().size());
        activityText.setText(getItem(position).getAction().getDescription());
        addressText.setText(getItem(position).getAction().getDescription());
        profilePicButton.setImageBitmap(getItem(position).getOwner().getProfilePic());
        return super.getView(position, convertView, parent);
    }
}
