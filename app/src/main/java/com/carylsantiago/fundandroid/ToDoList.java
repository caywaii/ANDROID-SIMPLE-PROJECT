
package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ToDoList extends AppCompatActivity {

    EditText list;
    Button home, addList;
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapters;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        listView = findViewById(R.id.viewList);
        home = findViewById(R.id.btnGoHomeToDo);
        addList = findViewById(R.id.btnAddList);
        list = findViewById(R.id.txtList);

        addList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
            }
        });

        items = new ArrayList<>();
        itemsAdapters = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(itemsAdapters);
        setUpListViewListener();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setUpListViewListener() {
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context context = getApplicationContext();
                Toast.makeText(context, "Item Removed", Toast.LENGTH_LONG).show();

                items.remove(i);
                itemsAdapters.notifyDataSetChanged();
                return true;
            }
        });
    }

    private void addItem(View view) {
        String addList = list.getText().toString();

        if(!(addList.equals(""))){
            itemsAdapters.add(addList);
            list.setText("");
        }else{
            Toast.makeText(getApplicationContext(), "Please Enter a List", Toast.LENGTH_LONG).show();
        }

    }
}