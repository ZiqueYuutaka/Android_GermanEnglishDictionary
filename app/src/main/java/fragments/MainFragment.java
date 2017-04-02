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

/*    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        //super.onCreateOptionsMenu(menu, inflater);
        Log.d(DEBUG,"onCreateOptionsMenu called...");
        inflater.inflate(R.menu.menu_main,menu);

    }*/

/*    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        Log.d(DEBUG,"Getting a menu item");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_list) {
            Log.d(DEBUG,"Setting clicked");
            return true;
        }else if(id == R.id.menu_nouns){
            Log.d(DEBUG,"Nouns clicked");
            return true;
        }else if(id == R.id.menu_verbs){
            Log.d(DEBUG,"Verbs clicked");
            return true;
        }else if(id == R.id.menu_prepositions){
            Log.d(DEBUG,"Prepositions clicked");
            return true;
        }else if(id == R.id.menu_adjectives){
            Log.d(DEBUG,"Adjectives clicked");
            return true;
        }else if(id == R.id.menu_adverbs){
            Log.d(DEBUG,"Adverbs clicked");
            return true;
        }else if(id == R.id.menu_numbers){
            Log.d(DEBUG,"Numbers clicked");
            return true;
        }else if(id == R.id.menu_search){
            Log.d(DEBUG,"Search clicked");
            return true;
        }else if(id == R.id.menu_quit){
            Log.d(DEBUG,"Quit clicked");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
