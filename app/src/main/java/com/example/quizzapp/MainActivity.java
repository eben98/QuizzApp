package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import Model.DataClass;
import ViewModel.QuizzViewModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
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
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);


        QuizzViewModel quizzViewModel = new QuizzViewModel();
        List<DataClass> AllQuestions = quizzViewModel.PassData();

        AdapterClass adapter = new AdapterClass(getApplicationContext(),AllQuestions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }



}
