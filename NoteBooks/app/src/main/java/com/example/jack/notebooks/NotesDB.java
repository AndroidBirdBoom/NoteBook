/**
 *  Author :Wang
 *  功能：数据库管理类的构建
 */
package com.example.jack.notebooks;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Jack on 2016/7/20.
 */
public class NotesDB extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "notes";
    public static final String CONTENT = "content";
    public static final String ID = "_id";
    public static final String TIME = "time";

    public static final String TABLE_NAME_LOGIN = "lagin";
    public static final String IID = "_iid";
    public static final String ACCOUNT = "account";
    public static final String TABLE_MIMA = "password";

    private Context mContext;
    public NotesDB(Context context) {
        super(context, "notes.db", null, 2);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLE_NAME + "(" + ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CONTENT
                + " TEXT NOT NULL," + TIME +" TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLE_NAME_LOGIN + "(" + IID
                + " INTEGER PRIMARY KEY AUTOINCREMENT, " + ACCOUNT
                + " TEXT NOT NULL," + TABLE_MIMA + " TEXT NOT NULL)");
        Toast.makeText(mContext,"success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists" + TABLE_NAME);
        sqLiteDatabase.execSQL("drop table if exists" + TABLE_NAME_LOGIN);
        onCreate(sqLiteDatabase);
    }
}
