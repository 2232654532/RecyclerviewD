package com.bwie.recyclerviewd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    String[] name={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件视图
        initView();
        //设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));//垂直方向的list
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));//水平方向的list
        //增加Item分割线，必须在setAdapter方法之前设置
        mRecyclerView.addItemDecoration(new DividerItem(this,DividerItem.VERTICAL_LIST));
        //设置增加和删除条目时的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(new RecyclerVAdapter(this,name));

    }

    /**
     * 初始化控件视图
     */
    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }
}
