package databaseObjects;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Zique Yuutaka on 4/5/2017.
 */

public class WordDBHelper extends SQLiteOpenHelper {
    private static final int VERSION =1;
    private static final String DATABASE_NAME = "wordsDB.db";

    public WordDBHelper(Context context){
        super(context, DATABASE_NAME, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
