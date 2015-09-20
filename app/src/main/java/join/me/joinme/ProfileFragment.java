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

/**
 * Created by Daniel on 2015-09-19.
 */
public class ProfileFragment extends Fragment {
    private ListView lv;
    private CustomHistoryListAdapter lvAdapter;
    private ArrayList<JoinMeActivity> joinMeActivityArray;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        //Fill in joinMeActivityArray
        joinMeActivityArray = new ArrayList<>();
        lvAdapter = new CustomHistoryListAdapter(view.getContext(),joinMeActivityArray);
        lv = (ListView) view.findViewById(R.id.joinMeActivityListHistory);
        lv.setAdapter(lvAdapter);

        super.onViewCreated(view, savedInstanceState);
    }

}
