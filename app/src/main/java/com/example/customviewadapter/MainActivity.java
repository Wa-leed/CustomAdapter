package com.example.customviewadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int[] imagId = {
            R.drawable.bird, R.drawable.cat, R.drawable.cow
    };String[] itemName = {
            "Bird", "Cat", "Cow"
    };String[] itemDesc = {
            "Bird description", "Cat description", "Cow description", "Dog description",
            "Fish description", "Penguin description", "Sparrow description"
    };@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter adapter = new CustomListAdapter(this, imagId, itemName, itemDesc);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemName[position];
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
