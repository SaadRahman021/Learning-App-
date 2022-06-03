package com.example.mathlearning;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyViewAdapter2 extends ArrayAdapter<Btn> {

    public MyViewAdapter2(@NonNull Context context , ArrayList<Btn> btnArrayList) {
        super(context, 0,btnArrayList);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Btn student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.btn_layout2, parent, false);
        Button btn2 = convertView.findViewById(R.id.button6);
        Button btn1 = convertView.findViewById(R.id.button5);

        btn1.setText(student.btn1);
        btn2.setText(student.btn2);


        return convertView;
    }
}
