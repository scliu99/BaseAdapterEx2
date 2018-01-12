package com.example.cafeburger.baseadapterex1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cafeburger on 2018/1/12.
 */

public class MyAdapter extends BaseAdapter {

    private List<Animal> animals;
    private Context context;
    public MyAdapter(Context context, List<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {

        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.list_item, parent, false);
        }

        // get current item to be displayed
        Animal item = (Animal) getItem(position);

        // get the TextView for item name and item description
        TextView textViewItemName = (TextView)
                convertView.findViewById(R.id.name);
        TextView textViewItemDescription = (TextView)
                convertView.findViewById(R.id.description);

        ImageView textViewItemImage = (ImageView)
                convertView.findViewById(R.id.image);

        //sets the text for item name and item description from the current item object
        textViewItemName.setText(item.getName());
        textViewItemImage.setImageResource(item.getImage());
        textViewItemDescription.setText(item.getDescription());
        // returns the view for the current row
        return convertView;
    }
}
