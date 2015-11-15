package com.example.hulk.cator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.firebase.client.Firebase;
import com.firebase.client.Query;
import com.firebase.ui.FirebaseRecyclerViewAdapter;

/**
 * Created by hulk on 11/13/15.
 */
public class People_adapter extends FirebaseRecyclerViewAdapter<People_model,ViewHolder> {

    Class<People_model> mModelClass;
    protected int mModelLayout;
    Class<ViewHolder> mViewHolderClass;
    FirebaseArray mSnapshots;


    public People_adapter(Class<People_model> modelClass, int modelLayout, Class<ViewHolder> viewHolderClass, Query ref) {
        super(modelClass, modelLayout, viewHolderClass, ref);

        mModelClass = modelClass;
        mModelLayout = modelLayout;
        mViewHolderClass = viewHolderClass;
        mSnapshots = new FirebaseArray(ref);
    }

    @Override
    public void populateViewHolder(ViewHolder viewHolder, People_model people_model) {

    }
}

