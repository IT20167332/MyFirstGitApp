package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textInPut1,textInPut2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInflater instance


    }
    public void BOnclick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        textInPut1 = (EditText)findViewById(R.id.editTextTextPersonName9);
        textInPut2 = (EditText)findViewById(R.id.editTextTextPersonName10);

        String No1 = textInPut1.getText().toString();
        String No2 = textInPut2.getText().toString();

        Context context = getApplicationContext();
        CharSequence messege = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;

       /* Toast toast = Toast.makeText(context,messege,duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
        toast.show();*/
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast,findViewById(R.id.custom_toast_layout));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        intent.putExtra("n1",No1);
        intent.putExtra("n2",No2);
        startActivity(intent);

    }
}