package com.example.hulk.cator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by hulk on 11/13/15.
 */
public class People_manager extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);


        //Helps with performance of the recler view page
        mRecyclerView.setHasFixedSize(true);

        //This is a  linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Specify now the Adapter
//        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);


    }
}
