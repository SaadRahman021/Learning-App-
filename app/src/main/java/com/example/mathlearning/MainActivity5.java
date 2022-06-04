package com.example.mathlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    TextView text;
    private ViewFlipper viewFlipper;
    int  i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text = findViewById(R.id.textV);
        text.setText("Division");
        ArrayList<Btn> studentArrayList = new ArrayList<Btn>();
        studentArrayList.add(new Btn("1/1 = " + (1/i),"2/1 =" + (2/i)));
        studentArrayList.add(new Btn("3/1 = " + (3/i),"4/1 =" + (4/i)));
        studentArrayList.add(new Btn("5/1 = " + (5/i),"6/1 =" + (6/i)));
        studentArrayList.add(new Btn("7/1 = " + (7/i),"8/1 =" + (8/i)));
        studentArrayList.add(new Btn("9/1 = " + (9/i),"10/1 =" + (10/i)));
        MyViewAdapter2 adapter = new MyViewAdapter2(this, studentArrayList);
        ListView listView = findViewById(R.id.myListView);
        listView.setAdapter(adapter);
        i++;
        ArrayList<Btn> studentArray = new ArrayList<Btn>();
        studentArray.add(new Btn("2/2 = " + (2/i),"4/2 =" + (4/i)));
        studentArray.add(new Btn("6/2 = " + (6/i),"8/2 =" + (8/i)));
        studentArray.add(new Btn("10/2 = " + (10/i),"12/2 =" + (12/i)));
        studentArray.add(new Btn("14/2 = " + (14/i),"16/2 =" + (16/i)));
        studentArray.add(new Btn("18/2 = " + (16/i),"20/2 =" + (20/i)));
        MyViewAdapter2 adapter1 = new MyViewAdapter2(this, studentArray);
        ListView listView1 = findViewById(R.id.myListView2);
        listView1.setAdapter(adapter1);

        i++;
        ArrayList<Btn> studentArray3 = new ArrayList<Btn>();
        studentArray3.add(new Btn("3/3 = " + (3/i),"6/3 =" + (6/i)));
        studentArray3.add(new Btn("9/3 = " + (9/i),"12/3 =" + (12/i)));
        studentArray3.add(new Btn("15/3 = " + (15/i),"18/3 =" + (18/i)));
        studentArray3.add(new Btn("21/3 = " + (21/i),"24/3 =" + (24/i)));
        studentArray3.add(new Btn("27/3 = " + (27/i),"30/3 =" + (30/i)));
        MyViewAdapter2 adapter3 = new MyViewAdapter2(this, studentArray3);
        ListView listView3 = findViewById(R.id.myListView3);
        listView3.setAdapter(adapter3);

        i++;
        ArrayList<Btn> studentArray4 = new ArrayList<Btn>();
        studentArray4.add(new Btn("4/4 = " + (4/i),"8/4 =" + (8/i)));
        studentArray4.add(new Btn("12/4 = " + (12/i),"16/4 =" + (16/i)));
        studentArray4.add(new Btn("20/4 = " + (20/i),"24/4 =" + (24/i)));
        studentArray4.add(new Btn("28/4 = " + (28/i),"32/4 =" + (32/i)));
        studentArray4.add(new Btn("36/4 = " + (36/i),"40/4 =" + (40/i)));
        MyViewAdapter2 adapter4 = new MyViewAdapter2(this, studentArray4);
        ListView listView4 = findViewById(R.id.myListView4);
        listView4.setAdapter(adapter4);

        i++;
        ArrayList<Btn> studentArray5 = new ArrayList<Btn>();
        studentArray5.add(new Btn("5/5 = " + (5/i),"10/5 =" + (10/i)));
        studentArray5.add(new Btn("15/5  = " + (15/i),"20/5 =" + (20/i)));
        studentArray5.add(new Btn("25/5 = " + (25/i),"30/5 =" + (30/i)));
        studentArray5.add(new Btn("35/5 = " + (35/i),"40/5 =" + (40/i)));
        studentArray5.add(new Btn("45/5 = " + (45/i),"50/5 =" + (50/i)));
        MyViewAdapter2 adapter5 = new MyViewAdapter2(this, studentArray5);
        ListView listView5 = findViewById(R.id.myListView5);
        listView5.setAdapter(adapter5);

        i++;
        ArrayList<Btn> studentArray6 = new ArrayList<Btn>();
        studentArray6.add(new Btn("6/6 = " + (6/i),"12/6 =" + (12/i)));
        studentArray6.add(new Btn("18/6 = " + (18/i),"24/6 =" + (24/i)));
        studentArray6.add(new Btn("30/6 = " + (30/i),"36/6 =" + (36/i)));
        studentArray6.add(new Btn("42/6 = " + (42/i),"48/6 =" + (48/i)));
        studentArray6.add(new Btn("54/6 = " + (54/i),"60/6 =" + (60/i)));
        MyViewAdapter2 adapter6 = new MyViewAdapter2(this, studentArray6);
        ListView listView6 = findViewById(R.id.myListView6);
        listView6.setAdapter(adapter6);

        i++;
        ArrayList<Btn> studentArray7 = new ArrayList<Btn>();
        studentArray7.add(new Btn("7/7 = " + (7/i),"14/7 =" + (14/i)));
        studentArray7.add(new Btn("21/7 = " + (21/i),"28/7 =" + (28/i)));
        studentArray7.add(new Btn("35/7 = " + (35/i),"42/7 =" + (42/i)));
        studentArray7.add(new Btn("49/7 = " + (49/i),"56/7 =" + (56/i)));
        studentArray7.add(new Btn("63/7 = " + (63/i),"70/7 =" + (70/i)));
        MyViewAdapter2 adapter7 = new MyViewAdapter2(this, studentArray7);
        ListView listView7 = findViewById(R.id.myListView7);
        listView7.setAdapter(adapter7);

        i++;
        ArrayList<Btn> studentArray8 = new ArrayList<Btn>();
        studentArray8.add(new Btn("8/8 = " + (8/i),"16/8 =" + (16/i)));
        studentArray8.add(new Btn("24/8 = " + (24/i),"32/8 =" + (32/i)));
        studentArray8.add(new Btn("40/8 = " + (40/i),"48/8 =" + (48/i)));
        studentArray8.add(new Btn("56/8 = " + (56/i),"64/8 =" + (64/i)));
        studentArray8.add(new Btn("72/8 = " + (72/i),"80/8 =" + (80/i)));
        MyViewAdapter2 adapter8 = new MyViewAdapter2(this, studentArray8);
        ListView listView8 = findViewById(R.id.myListView8);
        listView8.setAdapter(adapter8);

        i++;
        ArrayList<Btn> studentArray9 = new ArrayList<Btn>();
        studentArray9.add(new Btn("9/9 = " + (9/i),"18/9 =" + (18/i)));
        studentArray9.add(new Btn("27/9 = " + (27/i),"36/9 =" + (36/i)));
        studentArray9.add(new Btn("45/9 = " + (45/i),"54/9 =" + (54/i)));
        studentArray9.add(new Btn("63/9 = " + (63/i),"72/9 =" + (72/i)));
        studentArray9.add(new Btn("81/9 = " + (81/i),"90/9 =" + (90/i)));
        MyViewAdapter2 adapter9 = new MyViewAdapter2(this, studentArray9);
        ListView listView9 = findViewById(R.id.myListView9);
        listView9.setAdapter(adapter9);

        i++;

        ArrayList<Btn> studentArray1 = new ArrayList<Btn>();
        studentArray1.add(new Btn("10/10 = " + (10/i),"20/10 =" + (20/i)));
        studentArray1.add(new Btn("30/10 = " + (30/i),"40/10 =" + (40/i)));
        studentArray1.add(new Btn("50/10 = " + (50/i),"60/10 =" + (60/i)));
        studentArray1.add(new Btn("70/10 = " + (70/i),"80/10 =" + (80/i)));
        studentArray1.add(new Btn("90/10 = " + (90/i),"100/10 =" + (100/i)));
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