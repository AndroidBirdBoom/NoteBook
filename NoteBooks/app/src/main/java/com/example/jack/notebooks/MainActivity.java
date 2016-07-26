package com.example.jack.notebooks;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] names = {"综合笔记", "拍照笔记", "录音笔记", "视频笔记", "我的笔记", "闹钟提醒"};
    private int[] pictures = {R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1,};
    private GridView gridView;
    private SimpleAdapter adapter;
    private List<Map<String,Object>> list;
    private Intent  it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grilview);
        gridView = (GridView) findViewById(R.id.gv);
        list = new ArrayList<Map<String,Object>>();
        adapter = new SimpleAdapter(this,getData(),R.layout.grid_item,new String[]{"tubiao","dibiao"},new int[]{R.id.imageview,R.id.tv});
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        it = new Intent(MainActivity.this,ZongheContent.class);
        switch (i){
            //综合笔记
            case 0:
                //Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT).show();
              it.putExtra("flag","1");
                startActivity(it);
                break;
            //拍照笔记
            case 1:
                //Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                it.putExtra("flag","2");
                startActivity(it);
                break;
            //录音笔记
            case 2:
                //Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                it.putExtra("flag","3");
                startActivity(it);
                break;
            //视频笔记
            case 3:
                //Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                it.putExtra("flag","4");
                startActivity(it);
                break;
            //我的笔记
            case 4:
                //Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
                Intent mycontent = new Intent(MainActivity.this,MyContent.class);
                startActivity(mycontent);
                break;
            //闹钟提醒
            case 5:
                Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
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
