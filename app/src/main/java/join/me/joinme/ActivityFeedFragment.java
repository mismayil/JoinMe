package join.me.joinme;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import join.me.joinme.model.JoinMeActivity;

//Same as HomeFragment except the status bar is now a search bar
public class ActivityFeedFragment extends Fragment {
    private ListView lv;
    private CustomActivityListAdapter lvAdapter;
    private ArrayList<JoinMeActivity> joinMeActivityArray;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_activityfeed, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        //Fill in joinMeActivityArray

        lvAdapter = new CustomActivityListAdapter(getActivity(), joinMeActivityArray);
        lv = (ListView) view.findViewById(R.id.joinMeActivityList);
        ;
        lv.setAdapter(lvAdapter);


        super.onViewCreated(view, savedInstanceState);
    }
}
