package com.bwie.recyclerviewd;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作者：刘净辉 on 2016/9/17 0017 10:54
 * 邮箱：m18001307178_1@163.com
 */
public class RecyclerVAdapter extends RecyclerView.Adapter<RecyclerVAdapter.MyViewHolder>{

    Context context;
    String[] name;
    public RecyclerVAdapter(Context context, String[] name) {
        this.context=context;
        this.name=name;

    }
    //实例化ViewHolder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item, null);
        return new MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        String s = name[position];
        holder.textView.setText(s);

    }

    //条目数
    @Override
    public int getItemCount() {

        return name!=null?name.length:0;
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textview1);
        }
    }
}
