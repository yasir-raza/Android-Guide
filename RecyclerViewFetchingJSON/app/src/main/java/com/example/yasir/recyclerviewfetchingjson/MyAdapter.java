package com.example.yasir.recyclerviewfetchingjson;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Yasir on 8/29/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItem, Context context) {
        this.listItems = listItem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);
        holder.mHeading.setText(listItem.getmHeading());
        holder.mDesc.setText(listItem.getmDesc());

        Picasso.get()
                .load(listItem.getImageUrl())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mHeading;
        public TextView mDesc;
        public ImageView imageView;


        public ViewHolder(View itemView) {
            super(itemView);

            mHeading = itemView.findViewById(R.id.textHeading);
            mDesc = itemView.findViewById(R.id.textDesc);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
