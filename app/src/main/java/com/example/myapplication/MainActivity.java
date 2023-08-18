package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.listview);
        String[] name={"hamza","kashif","asadullah","anas","muzammil","azad","noman","rahil","muhammad","obaid","hamza","kashif",
                "asadullah","anas","muzammil","azad","noman","rahil","muhammad","obaid"};

        ArrayAdapter <String>arrayAdapter=new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,name);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Toast.makeText(MainActivity.this ,name[i]+"  selected  ", Toast.LENGTH_SHORT).show();
            }
        });
    }

}