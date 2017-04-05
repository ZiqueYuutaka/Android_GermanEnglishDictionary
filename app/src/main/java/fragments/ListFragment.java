package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.zique_yuutaka.germanenglishdictionary.R;

import java.util.List;

import wordObjects.Word;

/**
 * Created by Zique Yuutaka on 4/2/2017.
 */

public class ListFragment extends Fragment {

    private static String DEBUG = "LIST_FRAGMENT_DEBUG";

    private List<Word> mWords;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup fragContainer,
                             Bundle savedInstanceState){
        Log.d(DEBUG,"onCreateView called");
        View v = inflater.inflate(R.layout.fragment_wordlist, fragContainer, false);
//        Toolbar mToolbar = (Toolbar)v.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);
        //Set up menu actions
        return v;
    }

    private class WordHolder extends RecyclerView.ViewHolder{

        private TextView mGermanWord;
        private TextView mEnglishWord;
        private TextView mSpeechPart;
        private Word mWord;

        //Create the ViewHolder
        public WordHolder(View itemView){
            super(itemView);

            mGermanWord = (TextView) itemView.findViewById(R.id.german_word);
            mEnglishWord = (TextView) itemView.findViewById(R.id.english_word);
            mSpeechPart = (TextView) itemView.findViewById(R.id.word_type);
        }

        //Called in the Adapter.onBindViewHolder
        public void bindCrime(Word word){
            mWord = word;
            mGermanWord.setText(mWord.getGermanWord());
            mEnglishWord.setText(mWord.getEnglishWord());
            mSpeechPart.setText(mWord.getType());
        }

        //Overriden from View.OnClickListener
/*        @Override
        public void onClick(View v){
            mCallbacks.onCrimeSelected(mCrime, mCrimes.indexOf(mCrime));

        }*/
    } //End WordHolder

    private class CrimeAdapter extends RecyclerView.Adapter<WordHolder>{
        //moved to CrimeListFragment scope
        //private List<Crime> mCrimes;

        public CrimeAdapter(List<Word> words){
            mWords = words;
        }

        //Must override the following three methods
        @Override
        //Called when a new View is needed to display an item
        //Displays minimal information of the Crime
        public WordHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.word_item_layout, parent, false);
            return new WordHolder(view);
        }

        @Override
        public void onBindViewHolder(WordHolder holder, int position){
            Word word = mWords.get(position);
            holder.bindCrime(word);
        }

        @Override
        public int getItemCount(){
            return mWords.size();
        }

        //used to refresh the list of crimes
        public void setCrimes(List<Word> words){
            mWords = words;
        }
    }//End CrimeAdapter
}
