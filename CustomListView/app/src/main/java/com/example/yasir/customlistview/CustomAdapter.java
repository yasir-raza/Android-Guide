package com.example.yasir.customlistview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yasir on 8/28/2018.
 */

public class CustomAdapter extends ArrayAdapter<Heroes> {

    Context context;
    int resource;
    List<Heroes> h;

    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Heroes> h) {
        super(context, resource, h);
        this.context = context;
        this.resource = resource;
        this.h = h;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(resource,null);

        TextView title  = view.findViewById(R.id.textView);
        TextView subTitle  = view.findViewById(R.id.textView2);
        ImageView image = view.findViewById(R.id.imageView);

        Heroes heroes = h.get(position);

        //bind the data
        title.setText(heroes.getTitle());
        subTitle.setText(heroes.getSubTitle());
        image.setImageDrawable(context.getResources().getDrawable(heroes.getImage()));

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeItem(position);

            }
        });
        return view;
    }

    private void removeItem(final int position) {
        AlertDialog.Builder builder =  new AlertDialog.Builder(context);
        builder.setTitle("Are you sure you want to delete");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                h.remove(position);
                notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {}
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
