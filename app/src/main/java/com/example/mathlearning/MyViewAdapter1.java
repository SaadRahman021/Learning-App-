package com.example.mathlearning;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyViewAdapter1 extends ArrayAdapter<Btn> {

    public MyViewAdapter1(@NonNull Context context ,ArrayList<Btn> btnArrayList) {
        super(context, 0,btnArrayList);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Btn student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.btn_layout, parent, false);
        Button btn2 = convertView.findViewById(R.id.button2);
        Button btn1 = convertView.findViewById(R.id.button);

        btn2.setText(student.btn2);
        btn1.setText(student.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn1.getText() == "Add") {
                    Intent myIntent = new Intent(getContext(), MainActivity3.class);
                    getContext().startActivity(myIntent);
                }
                if(btn1.getText() == "Multiply"){
                    Intent myIntent = new Intent(getContext(), MainActivity6.class);
                    getContext().startActivity(myIntent);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn2.getText() == "Subtract") {
                    Intent myIntent = new Intent(getContext(), MainActivity4.class);
                    getContext().startActivity(myIntent);
                }
                if(btn2.getText() == "Divide"){
                    Intent myIntent = new Intent(getContext(), MainActivity5.class);
                    getContext().startActivity(myIntent);
                }
            }
        });

       
        return convertView;
    }
}
