package com.zique_yuutaka.germanenglishdictionary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import databaseObjects.WordDBHelper;
import wordObjects.Word;

/**
 * Created by Zique Yuutaka on 4/4/2017.
 */

public class WordDAO {

    private static SQLiteDatabase wordDB;

    private WordDAO(Context context){
        wordDB = new WordDBHelper(context).getWritableDatabase();
    }
    public static List<Word> getWords(){
        List<Word> words;
        words = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            words.add(new Word());
        }
        return words;
    }

/*    private static List<Word> getWordsFromDB(){

    }*/
}
