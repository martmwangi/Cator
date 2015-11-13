package com.example.hulk.cator;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hulk on 11/13/15.
 */
public  class ViewHolder extends RecyclerView.ViewHolder {
    TextView first_name,last_name,id,email,credit_card,country,company_name;
    public ViewHolder(View itemView) {
        super(itemView);
        first_name = (TextView) itemView.findViewById(R.id.first_name);
        last_name = (TextView) itemView.findViewById(R.id.last_name);
        id = (TextView) itemView.findViewById(R.id.id);
        email = (TextView) itemView.findViewById(R.id.email);
        credit_card = (TextView) itemView.findViewById(R.id.credit_card);
        company_name = (TextView) itemView.findViewById(R.id.company_name);
    }
}
