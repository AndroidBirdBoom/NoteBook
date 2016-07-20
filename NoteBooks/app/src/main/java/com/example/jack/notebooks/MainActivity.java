package com.example.jack.notebooks;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private NotesDB notesDB;
    private SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notesDB = new NotesDB(this);
        sqLiteDatabase = notesDB.getWritableDatabase();
        addDB();
    }
    public void addDB(){
        ContentValues values = new ContentValues();
        values.put(notesDB.CONTENT,"hello");
        values.put(notesDB.TIME,getTime());
        sqLiteDatabase.insert(notesDB.TABLE_NAME,null,values);
    }
    public String getTime(){
        Date nowTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String times = simpleDateFormat.format(nowTime);
        return times;
    }
}
