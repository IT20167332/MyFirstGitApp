package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textV1;
    int no1,no2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText1 = (EditText)findViewById(R.id.editTextTextPersonName5);
        editText2 = (EditText)findViewById(R.id.editTextTextPersonName6);


        Intent intent = getIntent();

        String No1 = intent.getStringExtra("n1");
        String No2 = intent.getStringExtra("n2");

        no1 = Integer.valueOf(No1);
        no2 = Integer.valueOf(No2);

        editText1.setText(No1);
        editText2.setText(No2);
    }
    public void add(View view){
        textV1 = (TextView)findViewById(R.id.textView7);
        textV1.setText(no1+ " + "+no2+" = "+(no1+no2));
    }
    public void div(View view){
        textV1 = (TextView)findViewById(R.id.textView7);
        textV1.setText(no1+ " / "+no2+" = "+(no1/no2));
    }
    public void multy(View view){
        textV1 = (TextView)findViewById(R.id.textView7);
        textV1.setText(no1+ " * "+no2+" = "+(no1*no2));
    }
    public void muns(View view){
        textV1 = (TextView)findViewById(R.id.textView7);
        textV1.setText(no1+ " - "+no2+" = "+(no1-no2));
    }


}