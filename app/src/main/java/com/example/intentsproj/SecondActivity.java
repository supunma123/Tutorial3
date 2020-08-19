package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText tv1 = (EditText) findViewById(R.id.pno1);
        EditText tv2 = (EditText) findViewById(R.id.pno2);

        tv1.setText(getIntent().getStringExtra("fno1"));
        tv2.setText(getIntent().getStringExtra("fno2"));

    }

    public void onButtonAdd(View v){

        EditText tv3 = (EditText)findViewById(R.id.pno1);
        EditText tv4 = (EditText)findViewById(R.id.pno2);

        TextView textview = (TextView) findViewById(R.id.textView5);

        int number1 = Integer.parseInt(tv3.getText().toString());
        int number2 = Integer.parseInt(tv4.getText().toString());


        int tot = 0;
        tot = number1 + number2;

        textview.setText(Integer.toString(tot));

    }

    public void onButtonSubtract(View v){

        EditText tv3 = (EditText)findViewById(R.id.pno1);
        EditText tv4 = (EditText)findViewById(R.id.pno2);

        TextView textview = (TextView) findViewById(R.id.textView5);

        int number1 = Integer.parseInt(tv3.getText().toString());
        int number2 = Integer.parseInt(tv4.getText().toString());


        int tot = 0;
        tot = number1 - number2;

        textview.setText(Integer.toString(tot));

    }

    public void onButtonDevide(View v){

        EditText tv3 = (EditText)findViewById(R.id.pno1);
        EditText tv4 = (EditText)findViewById(R.id.pno2);

        TextView textview = (TextView) findViewById(R.id.textView5);

        int number1 = Integer.parseInt(tv3.getText().toString());
        int number2 = Integer.parseInt(tv4.getText().toString());


        int tot = 0;
        tot = number1 / number2;

        textview.setText(Integer.toString(tot));

    }

    public void onButtonMultiply(View v){

        EditText tv3 = (EditText)findViewById(R.id.pno1);
        EditText tv4 = (EditText)findViewById(R.id.pno2);

        TextView textview = (TextView) findViewById(R.id.textView5);

        int number1 = Integer.parseInt(tv3.getText().toString());
        int number2 = Integer.parseInt(tv4.getText().toString());


        int tot = 0;
        tot = number1 * number2;

        textview.setText(Integer.toString(tot));

    }



}
