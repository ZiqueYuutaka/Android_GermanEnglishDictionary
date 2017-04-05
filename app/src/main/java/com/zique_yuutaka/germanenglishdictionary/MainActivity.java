package com.zique_yuutaka.germanenglishdictionary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import fragments.MainFragment;
import fragments.WordListFragment;

public class MainActivity extends AppCompatActivity {
    private static String DEBUG = "DEBUG";
    private static FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(DEBUG,"onCreate called");
        Log.d(DEBUG,"Getting savedInstanceState");
        super.onCreate(savedInstanceState);
        Log.d(DEBUG,"Getting activity_main");
        setContentView(R.layout.activity_main);

        Log.d(DEBUG,"Setting up toolbar");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.activity_main_fragment_container);

        if(fragment == null){
            fragment = new WordListFragment();
            fm.beginTransaction()
                    .add(R.id.activity_main_fragment_container, fragment)
                    .commit();
        }

        //FloatingActionButton Creation
/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(DEBUG,"Creating options menu...");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(DEBUG,"Getting a menu item");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_list) {
            Log.d(DEBUG,"Setting clicked");
            Log.d(DEBUG,"Launch CreateListFragment");
            return true;
        }else if(id == R.id.menu_nouns){
            Log.d(DEBUG,"Nouns clicked");
            Log.d(DEBUG,"Launch NounListFragment");
            /*Fragment listFragment = new WordListFragment();
            getSupportFragmentManager().beginTransaction().
            replace(R.id.activity_main_fragment_container, listFragment).commit();
             */
            return true;
        }else if(id == R.id.menu_verbs){
            Log.d(DEBUG,"Verbs clicked");
            Log.d(DEBUG,"Launch VerbListFragment");
            return true;
        }else if(id == R.id.menu_prepositions){
            Log.d(DEBUG,"Prepositions clicked");
            Log.d(DEBUG,"Launch PrepListFragment");
            return true;
        }else if(id == R.id.menu_adjectives){
            Log.d(DEBUG,"Adjectives clicked");
            Log.d(DEBUG,"Launch AdjListFragment");
            return true;
        }else if(id == R.id.menu_adverbs){
            Log.d(DEBUG,"Adverbs clicked");
            Log.d(DEBUG,"Launch AdvListFragment");
            return true;
        }else if(id == R.id.menu_numbers){
            Log.d(DEBUG,"Numbers clicked");
            Log.d(DEBUG,"Launch NumListFragment");
            return true;
        }else if(id == R.id.menu_search){
            Log.d(DEBUG,"Search clicked");
            Log.d(DEBUG,"Launch SearchFragment");
            return true;
        }else if(id == R.id.menu_quit){
            Log.d(DEBUG,"Quit clicked");
            Log.d(DEBUG,"Launch QuitFragment");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
