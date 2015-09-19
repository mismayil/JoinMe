package join.me.joinme;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.reflect.Array;

import join.me.joinme.model.JoinMeActivity;

/**
 * Created by Daniel on 2015-09-19.
 */
public class CustomActivityListAdapter extends ArrayAdapter<JoinMeActivity> {

    CustomActivityListAdapter(Context context, JoinMeActivity[] activities) {
        super(context, R.layout.home_list_object, activities);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.home_list_object, parent, false);

        TextView activityText =  (TextView) customView.findViewById(R.id.activityText);
        TextView addressText = (TextView) customView.findViewById(R.id.addressText);
        ImageButton profilePicButton = (ImageButton) customView.findViewById(R.id.profilePicButton);
        return super.getView(position, convertView, parent);
    }
}

