package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zique_yuutaka.germanenglishdictionary.R;
import com.zique_yuutaka.germanenglishdictionary.WordDAO;

import java.util.ArrayList;
import java.util.List;

import wordObjects.Word;

/**
 * Created by Zique Yuutaka on 4/2/2017.
 */

public class WordListFragment extends Fragment {

    private static String DEBUG = "LIST_FRAGMENT_DEBUG";

//    private List<Word> mWords;

    private RecyclerView wordRecycler;
    private WordAdapter mWordAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup fragContainer,
                             Bundle savedInstanceState){
        Log.d(DEBUG,"onCreateView called");
        View v = inflater.inflate(R.layout.fragment_wordlist, fragContainer, false);

        wordRecycler = (RecyclerView)v.findViewById(R.id.word_recycler);

        wordRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        setUI();

        return v;
    }

    private class WordHolder extends RecyclerView.ViewHolder{
        public TextView mTitleTextView;

        public WordHolder(View itemView){
            super(itemView);

            mTitleTextView = (TextView) itemView;
        }
    }

    private class WordAdapter extends RecyclerView.Adapter<WordHolder>{
        private List<Word> mWords;

        public WordAdapter(List<Word> words){

            mWords = words;
        }

        @Override
        public WordHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(android.R.layout.simple_list_item_1, parent,false);
            return new WordHolder(view);
        }

        @Override
        public void onBindViewHolder(WordHolder holder, int position){
            Word word = mWords.get(position);
            holder.mTitleTextView.setText(word.getGermanWord());
        }

        @Override
        public int getItemCount(){
            return mWords.size();
        }
    }

    private void setUI(){
        List<Word> words = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            words.add(new Word());
        }

        mWordAdapter = new WordAdapter(words);
        wordRecycler.setAdapter(mWordAdapter);
    }

/*    private class WordHolder extends RecyclerView.ViewHolder{

        private TextView mGermanWord;
        private TextView mEnglishWord;
        private TextView mSpeechPart;
        public TextView mTitleTextView;

        private Word mWord;

        //Create the ViewHolder
        public WordHolder(View itemView){
            super(itemView);
            mTitleTextView = (TextView) itemView;
            mGermanWord = (TextView) itemView.findViewById(R.id.german_word);
            mEnglishWord = (TextView) itemView.findViewById(R.id.english_word);
            mSpeechPart = (TextView) itemView.findViewById(R.id.word_type);
        }

        //Called in the Adapter.onBindViewHolder
        public void bindWord(Word word){
            mWord = word;
            mGermanWord.setText(mWord.getGermanWord());
            mEnglishWord.setText(mWord.getEnglishWord());
            mSpeechPart.setText(mWord.getType());
        }

        //Overriden from View.OnClickListener
        @Override
        public void onClick(View v){
            mCallbacks.onCrimeSelected(mCrime, mCrimes.indexOf(mCrime));

        }
    } //End WordHolder

    private class WordAdapter extends RecyclerView.Adapter<WordHolder>{
        //moved to CrimeListFragment scope
        private List<Word> mWords;

        public WordAdapter(List<Word> words){
            mWords = words;
        }

        //Must override the following three methods
        @Override
        //Called when a new View is needed to display an item
        //Displays minimal information of the Crime
        public WordHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            return new WordHolder(view);
        }

        @Override
        public void onBindViewHolder(WordHolder holder, int position){
            Word word = mWords.get(position);
            //holder.bindWord(word);
            holder.mTitleTextView.setText(word.getGermanWord());
        }

        @Override
        public int getItemCount(){

            return mWords.size();
        }

        //used to refresh the list of crimes
        public void setCrimes(List<Word> words){
            mWords = words;
        }
    }//End WordAdapter

    //Sets the List UI by placing adapter in recyclerview
    private void setUI(){
        List<Word> words = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            words.add(new Word());
        }
        mWordAdapter = new WordAdapter(words);
        wordRecycler.setAdapter(mWordAdapter);
    }*/
}
