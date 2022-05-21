package com.example.mathlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity7 extends AppCompatActivity {



    public static boolean isInt(String str) {

        try {
            @SuppressWarnings("unused")
            int x = Integer.parseInt(str);
            return true; //String is an Integer
        } catch (NumberFormatException e) {
            return false; //String is not an Integer
        }

    }
    TextView text,ed;
    Button nxt,chck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        text=findViewById(R.id.textView);
        ed=findViewById(R.id.textView2);
        nxt=findViewById(R.id.button4);
        chck=findViewById(R.id.button7);
        Random rand = new Random();

        int n = rand.nextInt(100);


        Random random = new Random();

        String setOfCharacters = "+-x";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);

        Random rand2 = new Random();

        int num = rand2.nextInt(100);

        text.setText(Integer.toString(n)+" "+randomChar+" "+Integer.toString(num) + " = ");



        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity7.this, MainActivity7.class);
                MainActivity7.this.startActivity(myIntent);
            }
        });

        chck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Ans = ed.getText().toString();
                int x;
                if(randomChar=='+')
                     x = num+n;
                else if(randomChar=='-')
                    x=n-num;
                else
                    x=n*num;

                if(!isInt(Ans))
                    Ans="0";
                if(Integer.parseInt(Ans)==x)
                {
                    text.setText("Right Answer");
                }
                else
                {
                    text.setText("Wrong Answer");
                }
            }
        });



    }
}