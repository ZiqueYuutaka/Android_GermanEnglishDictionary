package com.zique_yuutaka.germanenglishdictionary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import wordObjects.Word;

/**
 * Created by Zique Yuutaka on 4/4/2017.
 */

public class WordDAO {



    public static List<Word> getWords(){
        List<Word> words;
        words = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            words.add(new Word());
        }
        return words;
    }
}
