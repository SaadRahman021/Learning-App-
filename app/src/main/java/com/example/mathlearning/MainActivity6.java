package com.example.mathlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    TextView text;
    private ViewFlipper viewFlipper;
    int  i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text = findViewById(R.id.textV);
        text.setText("Multiplication");
        ArrayList<Btn> studentArrayList = new ArrayList<Btn>();
        studentArrayList.add(new Btn("1 x 1 = " + (i+1),"2 x 1 =" + (i+2)));
        studentArrayList.add(new Btn("3 x 1 = " + (i+3),"4 x 1 =" + (i+4)));
        studentArrayList.add(new Btn("5 x 1 = " + (i+5),"6 x 1 =" + (i+6)));
        studentArrayList.add(new Btn("7 x 1 = " + (i+7),"8 x 1 =" + (i+8)));
        studentArrayList.add(new Btn("9 x 1 = " + (i+9),"10 x 1 =" + (i+10)));
        MyViewAdapter2 adapter = new MyViewAdapter2(this, studentArrayList);
        ListView listView = findViewById(R.id.myListView);
        listView.setAdapter(adapter);
        i++;
        ArrayList<Btn> studentArray = new ArrayList<Btn>();
        studentArray.add(new Btn("1 x 2 = " + (i+1),"2 x 2 =" + (i+2)));
        studentArray.add(new Btn("3 x 2 = " + (i+3),"4 x 2 =" + (i+4)));
        studentArray.add(new Btn("5 x 2 = " + (i+5),"6 x 2 =" + (i+6)));
        studentArray.add(new Btn("7 x 2 = " + (i+7),"8 x 2 =" + (i+8)));
        studentArray.add(new Btn("9 x 2 = " + (i+9),"10 x 2 =" + (i+10)));
        MyViewAdapter2 adapter1 = new MyViewAdapter2(this, studentArray);
        ListView listView1 = findViewById(R.id.myListView2);
        listView1.setAdapter(adapter1);

        i++;
        ArrayList<Btn> studentArray3 = new ArrayList<Btn>();
        studentArray3.add(new Btn("1 x 3 = " + (i+1),"2 x 3 =" + (i+2)));
        studentArray3.add(new Btn("3 x 3 = " + (i+3),"4 x 3 =" + (i+4)));
        studentArray3.add(new Btn("5 x 3 = " + (i+5),"6 x 3 =" + (i+6)));
        studentArray3.add(new Btn("7 x 3 = " + (i+7),"8 x 3 =" + (i+8)));
        studentArray3.add(new Btn("9 x 3 = " + (i+9),"10 x 3 =" + (i+10)));
        MyViewAdapter2 adapter3 = new MyViewAdapter2(this, studentArray3);
        ListView listView3 = findViewById(R.id.myListView3);
        listView3.setAdapter(adapter3);

        i++;
        ArrayList<Btn> studentArray4 = new ArrayList<Btn>();
        studentArray4.add(new Btn("1 x 4 = " + (i+1),"2 x 4 =" + (i+2)));
        studentArray4.add(new Btn("3 x 4 = " + (i+3),"4 x 4 =" + (i+4)));
        studentArray4.add(new Btn("5 x 4 = " + (i+5),"6 x 4 =" + (i+6)));
        studentArray4.add(new Btn("7 x 4 = " + (i+7),"8 x 4 =" + (i+8)));
        studentArray4.add(new Btn("9 x 4 = " + (i+9),"10 x 4 =" + (i+10)));
        MyViewAdapter2 adapter4 = new MyViewAdapter2(this, studentArray4);
        ListView listView4 = findViewById(R.id.myListView4);
        listView4.setAdapter(adapter4);

        i++;
        ArrayList<Btn> studentArray5 = new ArrayList<Btn>();
        studentArray5.add(new Btn("1 x 5 = " + (i+1),"2 x 5 =" + (i+2)));
        studentArray5.add(new Btn("3 x 5  = " + (i+3),"4 x 5 =" + (i+4)));
        studentArray5.add(new Btn("5 x 5 = " + (i+5),"6 x 5 =" + (i+6)));
        studentArray5.add(new Btn("7 x 5 = " + (i+7),"8 x 5 =" + (i+8)));
        studentArray5.add(new Btn("9 x 5 = " + (i+9),"10 x 5 =" + (i+10)));
        MyViewAdapter2 adapter5 = new MyViewAdapter2(this, studentArray5);
        ListView listView5 = findViewById(R.id.myListView5);
        listView5.setAdapter(adapter5);

        i++;
        ArrayList<Btn> studentArray6 = new ArrayList<Btn>();
        studentArray6.add(new Btn("1 x 6 = " + (i+1),"2 x 6 =" + (i+2)));
        studentArray6.add(new Btn("3 x 6 = " + (i+3),"4 x 6 =" + (i+4)));
        studentArray6.add(new Btn("5 x 6 = " + (i+5),"6 x 6 =" + (i+6)));
        studentArray6.add(new Btn("7 x 6 = " + (i+7),"8 x 6 =" + (i+8)));
        studentArray6.add(new Btn("9 x 6 = " + (i+9),"10 x 6 =" + (i+10)));
        MyViewAdapter2 adapter6 = new MyViewAdapter2(this, studentArray6);
        ListView listView6 = findViewById(R.id.myListView6);
        listView6.setAdapter(adapter6);

        i++;
        ArrayList<Btn> studentArray7 = new ArrayList<Btn>();
        studentArray7.add(new Btn("1 x 7 = " + (i+1),"2 x 7 =" + (i+2)));
        studentArray7.add(new Btn("3 x 7 = " + (i+3),"4 x 7 =" + (i+4)));
        studentArray7.add(new Btn("5 x 7 = " + (i+5),"6 x 7 =" + (i+6)));
        studentArray7.add(new Btn("7 x 7 = " + (i+7),"8 x 7 =" + (i+8)));
        studentArray7.add(new Btn("9 x 7 = " + (i+9),"10 x 7 =" + (i+10)));
        MyViewAdapter2 adapter7 = new MyViewAdapter2(this, studentArray7);
        ListView listView7 = findViewById(R.id.myListView7);
        listView7.setAdapter(adapter7);

        i++;
        ArrayList<Btn> studentArray8 = new ArrayList<Btn>();
        studentArray8.add(new Btn("1 x 8 = " + (i+1),"2 x 8 =" + (i+2)));
        studentArray8.add(new Btn("3 x 8 = " + (i+3),"4 x 8 =" + (i+4)));
        studentArray8.add(new Btn("5 x 8 = " + (i+5),"6 x 8 =" + (i+6)));
        studentArray8.add(new Btn("7 x 8 = " + (i+7),"8 x 8 =" + (i+8)));
        studentArray8.add(new Btn("9 x 8 = " + (i+9),"10 x 8 =" + (i+10)));
        MyViewAdapter2 adapter8 = new MyViewAdapter2(this, studentArray8);
        ListView listView8 = findViewById(R.id.myListView8);
        listView8.setAdapter(adapter8);

        i++;
        ArrayList<Btn> studentArray9 = new ArrayList<Btn>();
        studentArray9.add(new Btn("1 x 9 = " + (i+1),"2 x 9 =" + (i+2)));
        studentArray9.add(new Btn("3 x 9 = " + (i+3),"4 x 9 =" + (i+4)));
        studentArray9.add(new Btn("5 x 9 = " + (i+5),"6 x 9 =" + (i+6)));
        studentArray9.add(new Btn("7 x 9 = " + (i+7),"8 x 9 =" + (i+8)));
        studentArray9.add(new Btn("9 x 9 = " + (i+9),"10 x 9 =" + (i+10)));
        MyViewAdapter2 adapter9 = new MyViewAdapter2(this, studentArray9);
        ListView listView9 = findViewById(R.id.myListView9);
        listView9.setAdapter(adapter9);

        i++;

        ArrayList<Btn> studentArray1 = new ArrayList<Btn>();
        studentArray1.add(new Btn("1 x 10 = " + (i+1),"2 x 10 =" + (i+2)));
        studentArray1.add(new Btn("3 x 10 = " + (i+3),"4 x 10 =" + (i+4)));
        studentArray1.add(new Btn("5 x 10 = " + (i+5),"6 x 10 =" + (i+6)));
        studentArray1.add(new Btn("7 x 10 = " + (i+7),"8 x 10 =" + (i+8)));
        studentArray1.add(new Btn("9 x 10 = " + (i+9),"10 x 10 =" + (i+10)));
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