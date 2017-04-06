package databaseObjects;

/**
 * Created by Zique Yuutaka on 4/5/2017.
 */

public class WordDBSchema {

    public static final class WordTable{
        public static final String NAME = "words";

        public static final class Cols{
            public static final String GERMAN_WORD = "germanword";
            public static final String ENGLISH_WORD = "englishword";
            public static final String TYPE = "type";
        }
    }
}
