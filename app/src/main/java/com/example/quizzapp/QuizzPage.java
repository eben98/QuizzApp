package com.example.quizzapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ServerClass.ServerApi;

public class QuizzPage  extends AppCompatActivity {

    TextView Question;
    TextView Option1;
    TextView Option2;
    TextView Option3;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout);

        Question = findViewById(R.id.question);
        Option1 = findViewById(R.id.text_option1);
        Option2 = findViewById(R.id.text_option2);
        Option3 = findViewById(R.id.text_option3);



    }
    public  void checker(){
        if(checkBox1.isChecked()){
            String firstOption = Option1.getText().toString();

        }
        if (checkBox2.isChecked()) {
            String secondOption = Option2.getText().toString();
        }
        if (checkBox3.isChecked()) {
            String thirdOption = Option3.getText().toString();
        }
    }



}
