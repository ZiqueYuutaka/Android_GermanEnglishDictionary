package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.zique_yuutaka.germanenglishdictionary.R;

/**
 * Created by Zique Yuutaka on 4/2/2017.
 */

public class MainFragment extends Fragment{

    private static String DEBUG="FRAG_DEBUG";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup fragContainer,
                             Bundle savedInstanceState){
        Log.d(DEBUG,"onCreateView called");
        View v = inflater.inflate(R.layout.fragment_main, fragContainer, false);
//        Toolbar mToolbar = (Toolbar)v.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);
        //Set up menu actions
        return v;
    }
}
