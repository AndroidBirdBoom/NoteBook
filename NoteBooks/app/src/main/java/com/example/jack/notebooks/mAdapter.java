package com.example.jack.notebooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jack on 2016/7/21.
 */
public class mAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater layoutInflater;
    private ImageView imageView;
    private TextView textView;
    private String[] names = {"综合笔记", "拍照笔记", "录音笔记", "视频笔记", "我的笔记", "闹钟提醒"};
    private int[] pictures = {R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1, R.drawable.demo1,};

    public mAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.grid_item,null);
        imageView = (ImageView) view1.findViewById(R.id.imageview);
        textView = (TextView) view1.findViewById(R.id.tv);
        imageView.setImageResource(pictures[i]);
        textView.setText(names[i]);
        return view1;
    }
}
