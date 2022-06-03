package com.example.mathlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    int  i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ArrayList<Btn> studentArrayList = new ArrayList<Btn>();
        studentArrayList.add(new Btn("1 + 1 = "+ (i+1),"2 + 1 =" + (i+2)));
        studentArrayList.add(new Btn("3 + 1 = "+ (i+3),"4 + 1 =" + (i+4)));
        studentArrayList.add(new Btn("5 + 1 = "+ (i+5),"6 + 1 =" + (i+6)));
        studentArrayList.add(new Btn("7 + 1 = "+ (i+7),"8 + 1 =" + (i+8)));
        studentArrayList.add(new Btn("9 + 1 = "+ (i+9),"10 + 1 =" + (i+10)));
        MyViewAdapter2 adapter = new MyViewAdapter2(this, studentArrayList);
        ListView listView = findViewById(R.id.myListView);
        listView.setAdapter(adapter);
        i++;
        ArrayList<Btn> studentArray = new ArrayList<Btn>();
        studentArray.add(new Btn("1 + 2 = "+ (i+1),"2 + 2 =" + (i+2)));
        studentArray.add(new Btn("3 + 2 = "+ (i+3),"4 + 2 =" + (i+4)));
        studentArray.add(new Btn("5 + 2 = "+ (i+5),"6 + 2 =" + (i+6)));
        studentArray.add(new Btn("7 + 2 = "+ (i+7),"8 + 2 =" + (i+8)));
        studentArray.add(new Btn("9 + 2 = "+ (i+9),"10 + 2 =" + (i+10)));
        MyViewAdapter2 adapter1 = new MyViewAdapter2(this, studentArray);
        ListView listView1 = findViewById(R.id.myListView2);
        listView1.setAdapter(adapter1);

        i++;
        ArrayList<Btn> studentArray3 = new ArrayList<Btn>();
        studentArray3.add(new Btn("1 + 3 = "+ (i+1),"2 + 3 =" + (i+2)));
        studentArray3.add(new Btn("3 + 3 = "+ (i+3),"4 + 3 =" + (i+4)));
        studentArray3.add(new Btn("5 + 3 = "+ (i+5),"6 + 3 =" + (i+6)));
        studentArray3.add(new Btn("7 + 3 = "+ (i+7),"8 + 3 =" + (i+8)));
        studentArray3.add(new Btn("9 + 3 = "+ (i+9),"10 + 3 =" + (i+10)));
        MyViewAdapter2 adapter3 = new MyViewAdapter2(this, studentArray3);
        ListView listView3 = findViewById(R.id.myListView3);
        listView3.setAdapter(adapter3);

        i++;
        ArrayList<Btn> studentArray4 = new ArrayList<Btn>();
        studentArray4.add(new Btn("1 + 4 = "+ (i+1),"2 + 4 =" + (i+2)));
        studentArray4.add(new Btn("3 + 4 = "+ (i+3),"4 + 4 =" + (i+4)));
        studentArray4.add(new Btn("5 + 4 = "+ (i+5),"6 + 4 =" + (i+6)));
        studentArray4.add(new Btn("7 + 4 = "+ (i+7),"8 + 4 =" + (i+8)));
        studentArray4.add(new Btn("9 + 4 = "+ (i+9),"10 + 4 =" + (i+10)));
        MyViewAdapter2 adapter4 = new MyViewAdapter2(this, studentArray4);
        ListView listView4 = findViewById(R.id.myListView4);
        listView4.setAdapter(adapter4);

        i++;
        ArrayList<Btn> studentArray5 = new ArrayList<Btn>();
        studentArray5.add(new Btn("1 + 5 = "+ (i+1),"2 + 5 =" + (i+2)));
        studentArray5.add(new Btn("3 + 5  = "+ (i+3),"4 + 5 =" + (i+4)));
        studentArray5.add(new Btn("5 + 5 = "+ (i+5),"6 + 5 =" + (i+6)));
        studentArray5.add(new Btn("7 + 5 = "+ (i+7),"8 + 5 =" + (i+8)));
        studentArray5.add(new Btn("9 + 5 = "+ (i+9),"10 + 5 =" + (i+10)));
        MyViewAdapter2 adapter5 = new MyViewAdapter2(this, studentArray5);
        ListView listView5 = findViewById(R.id.myListView5);
        listView5.setAdapter(adapter5);

        i++;
        ArrayList<Btn> studentArray6 = new ArrayList<Btn>();
        studentArray6.add(new Btn("1 + 6 = "+ (i+1),"2 + 6 =" + (i+2)));
        studentArray6.add(new Btn("3 + 6 = "+ (i+3),"4 + 6 =" + (i+4)));
        studentArray6.add(new Btn("5 + 6 = "+ (i+5),"6 + 6 =" + (i+6)));
        studentArray6.add(new Btn("7 + 6 = "+ (i+7),"8 + 6 =" + (i+8)));
        studentArray6.add(new Btn("9 + 6 = "+ (i+9),"10 + 6 =" + (i+10)));
        MyViewAdapter2 adapter6 = new MyViewAdapter2(this, studentArray6);
        ListView listView6 = findViewById(R.id.myListView6);
        listView6.setAdapter(adapter6);

        i++;
        ArrayList<Btn> studentArray7 = new ArrayList<Btn>();
        studentArray7.add(new Btn("1 + 7 = "+ (i+1),"2 + 7 =" + (i+2)));
        studentArray7.add(new Btn("3 + 7 = "+ (i+3),"4 + 7 =" + (i+4)));
        studentArray7.add(new Btn("5 + 7 = "+ (i+5),"6 + 7 =" + (i+6)));
        studentArray7.add(new Btn("7 + 7 = "+ (i+7),"8 + 7 =" + (i+8)));
        studentArray7.add(new Btn("9 + 7 = "+ (i+9),"10 + 7 =" + (i+10)));
        MyViewAdapter2 adapter7 = new MyViewAdapter2(this, studentArray7);
        ListView listView7 = findViewById(R.id.myListView7);
        listView7.setAdapter(adapter7);

        i++;
        ArrayList<Btn> studentArray8 = new ArrayList<Btn>();
        studentArray8.add(new Btn("1 + 8 = "+ (i+1),"2 + 8 =" + (i+2)));
        studentArray8.add(new Btn("3 + 8 = "+ (i+3),"4 + 8 =" + (i+4)));
        studentArray8.add(new Btn("5 + 8 = "+ (i+5),"6 + 8 =" + (i+6)));
        studentArray8.add(new Btn("7 + 8 = "+ (i+7),"8 + 8 =" + (i+8)));
        studentArray8.add(new Btn("9 + 8 = "+ (i+9),"10 + 8 =" + (i+10)));
        MyViewAdapter2 adapter8 = new MyViewAdapter2(this, studentArray8);
        ListView listView8 = findViewById(R.id.myListView8);
        listView8.setAdapter(adapter8);

        i++;
        ArrayList<Btn> studentArray9 = new ArrayList<Btn>();
        studentArray9.add(new Btn("1 + 9 = "+ (i+1),"2 + 9 =" + (i+2)));
        studentArray9.add(new Btn("3 + 9 = "+ (i+3),"4 + 9 =" + (i+4)));
        studentArray9.add(new Btn("5 + 9 = "+ (i+5),"6 + 9 =" + (i+6)));
        studentArray9.add(new Btn("7 + 9 = "+ (i+7),"8 + 9 =" + (i+8)));
        studentArray9.add(new Btn("9 + 9 = "+ (i+9),"10 + 9 =" + (i+10)));
        MyViewAdapter2 adapter9 = new MyViewAdapter2(this, studentArray9);
        ListView listView9 = findViewById(R.id.myListView9);
        listView9.setAdapter(adapter9);

        i++;
        ArrayList<Btn> studentArray1 = new ArrayList<Btn>();
        studentArray1.add(new Btn("1 + 10 = "+ (i+1),"2 + 10 =" + (i+2)));
        studentArray1.add(new Btn("3 + 10 = "+ (i+3),"4 + 10 =" + (i+4)));
        studentArray1.add(new Btn("5 + 10 = "+ (i+5),"6 + 10 =" + (i+6)));
        studentArray1.add(new Btn("7 + 10 = "+ (i+7),"8 + 10 =" + (i+8)));
        studentArray1.add(new Btn("9 + 10 = "+ (i+9),"10 + 10 =" + (i+10)));
        MyViewAdapter2 adapter10 = new MyViewAdapter2(this, studentArray1);
        ListView listView10 = findViewById(R.id.myListView10);
        listView10.setAdapter(adapter10);


        viewFlipper = findViewById(R.id.view_flipper);

    }

    public void previousView(View v) {
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        //viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.showPrevious();
    }

    public void nextView(View v) {
        //viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.showNext();
    }
}