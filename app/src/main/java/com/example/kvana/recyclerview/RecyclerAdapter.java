package com.example.kvana.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kvana on 5/12/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] country,capital;


    RecyclerAdapter(String[] country,String[] capital){
        this.country = country;
        this.capital = capital;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tv_country.setText(country[position]);
        holder.tv_captital.setText(capital[position]);
    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView tv_country,tv_captital;
        RecyclerViewHolder(View view){
            super(view);
            tv_country = (TextView) view.findViewById(R.id.tv_country);
            tv_captital = (TextView) view.findViewById(R.id.tv_capital);
        }
    }
}
