package com.animefanbase.animeinfofun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String listFruit[];
    int listImages[];
    LayoutInflater intflater;

    public CustomBaseAdapter(Context ctx, String [] fruitList, int [] images) {
        this.context = ctx;
        this.listFruit = fruitList;
        this.listImages = images;
        intflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listFruit.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        convertView = intflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView);
        ImageView fruitImg = (ImageView) convertView.findViewById(R.id.imageIcon);
        txtView.setText(listFruit[i]);
        fruitImg.setImageResource(listImages[i]);
        return convertView;
    }
}
