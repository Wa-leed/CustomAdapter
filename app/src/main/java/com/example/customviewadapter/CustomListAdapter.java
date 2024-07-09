package com.example.customviewadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomListAdapter extends ArrayAdapter<String> {
    private final String[] itemName;
    private final int[] imageId;
    private final String[] itemDescription;
    private final Activity context;
    public CustomListAdapter(Activity context, int[] imgId, String[] itemNam, String[] itemDesc) {
        super(context, R.layout.list_item, itemNam);
        this.context = context;
        this.imageId = imgId;
        this.itemName = itemNam;
        this.itemDescription = itemDesc;
    }@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            listItemView = inflater.inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = listItemView.findViewById(R.id.icon);
        TextView itemTitle = listItemView.findViewById(R.id.item);
        TextView descTextView = listItemView.findViewById(R.id.itemDesc);

        imageView.setImageResource(imageId[position]);
        itemTitle.setText(itemName[position]);
        descTextView.setText(itemDescription[position]);

        return listItemView;
    }
}
