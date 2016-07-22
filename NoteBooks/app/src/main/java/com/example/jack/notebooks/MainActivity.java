package com.example.jack.notebooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private String[] names = {"综合笔记", "拍照笔记", "录音笔记", "视频笔记", "我的笔记", "闹钟提醒"};
    private int[] pictures = {R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1,};
    private GridView gridView;
    private SimpleAdapter adapter;
    private List<Map<String,Object>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grilview);
        gridView = (GridView) findViewById(R.id.gv);
        list = new ArrayList<Map<String,Object>>();
        adapter = new SimpleAdapter(this,getData(),R.layout.grid_item,new String[]{"tubiao","dibiao"},new int[]{R.id.imageview,R.id.tv});
        gridView.setAdapter(adapter);
    }
    public List<Map<String,Object>> getData(){
        for (int i = 0; i<names.length;i++){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("tubiao",pictures[i]);
            map.put("dibiao",names[i]);
            list.add(map);
        }
        return list;
    }
    /*public void addDB(){
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
    }*/
}
