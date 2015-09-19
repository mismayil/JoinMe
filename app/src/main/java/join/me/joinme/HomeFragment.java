package join.me.joinme;

import android.app.Fragment;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import join.me.joinme.model.JoinMeActivity;

public class HomeFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        //Fill in joinMeActivityArray

        lvAdapter = new CustomActivityListAdapter(getActivity(),joinMeActivityArray);
        lv = (ListView) view.findViewById(R.id.joinMeActivityList);;
        lv.setAdapter(lvAdapter);



        super.onViewCreated(view, savedInstanceState);
    }
}

