package com.kawale.pankaj.goatfarm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pankaj on 9/11/2017.
 */

public class DatabaseManager extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "farming.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DatabaseContract.Goat.TABLE_NAME + " (" +
                    DatabaseContract.Goat.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    DatabaseContract.Goat.COLUMN_NAME + " TEXT," +
                    DatabaseContract.Goat.COLUMN_TYPE + " TEXT," +
                    DatabaseContract.Goat.COLUMN_DATE_OF_BIRTH + " TEXT," +
                    DatabaseContract.Goat.COLUMN_DATE_OF_DEATH + " TEXT," +
                    DatabaseContract.Goat.COLUMN_COMMENTS + " TEXT," +
                    DatabaseContract.Goat.COLUMN_MOTHER + " TEXT," +
                    DatabaseContract.Goat.COLUMN_FATHER + " TEXT)" +
            "CREATE TABLE " + DatabaseContract.Transaction.TABLE_NAME + " (" +
                    DatabaseContract.Transaction.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    DatabaseContract.Transaction.COLUMN_TYPE + " TEXT," +
                    DatabaseContract.Transaction.COLUMN_AMOUNT + " TEXT," +
                    DatabaseContract.Transaction.COLUMN_DATE + " TEXT," +
                    DatabaseContract.Transaction.COLUMN_COMMENT + " TEXT," +
                    DatabaseContract.Transaction.COLUMN_DESCRIPTION + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DatabaseContract.Transaction.TABLE_NAME + ";" +
                    "DROP TABLE IF EXISTS " + DatabaseContract.Goat.TABLE_NAME + ";";

    public DatabaseManager(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
