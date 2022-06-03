package com.example.mathlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

   // Button add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ArrayList<Btn> studentArrayList = new ArrayList<Btn>();
        studentArrayList.add(new Btn("Add","Subtract"));
        studentArrayList.add(new Btn("Multiply","Divide"));
        MyViewAdapter1 adapter = new MyViewAdapter1(this, studentArrayList);
        ListView listView = findViewById(R.id.myListView);
        listView.setAdapter(adapter);
        /*
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity2.this, MainActivity3.class);
                MainActivity2.this.startActivity(myIntent);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity2.this, MainActivity4.class);
                MainActivity2.this.startActivity(myIntent);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity2.this, MainActivity5.class);
                MainActivity2.this.startActivity(myIntent);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity2.this, MainActivity6.class);
                MainActivity2.this.startActivity(myIntent);
            }
        });*/
    }


}