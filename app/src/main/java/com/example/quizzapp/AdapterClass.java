package com.example.quizzapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import Model.DataClass;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder>  {

    private Context context;
    public List<DataClass> AllQuestions;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Question;
        public RadioButton radioButton1;
        public RadioButton radioButton2;
        public RadioButton radioButton3;
        public RadioGroup radioGroup;
        public String eben;

        public MyViewHolder(View view, int viewType) {
            super(view);
            Question = view.findViewById(R.id.question);
            radioButton1 = view.findViewById(R.id.radio_option1);
            radioButton2 = view.findViewById(R.id.radio_option2);
            radioButton3 = view.findViewById(R.id.radio_option3);
            radioGroup = view.findViewById(R.id.radio_group);

        }
    }

    public AdapterClass(Context context,  List<DataClass> AllQuestions ) {
        this.context = context;
        this.AllQuestions = AllQuestions;
    }

    @Override
    public AdapterClass.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.try2_layout, parent, false);

        return new AdapterClass.MyViewHolder(itemView, viewType);
    }

    @Override
    public void onBindViewHolder(final AdapterClass.MyViewHolder holder, final int position) {
        final DataClass item = AllQuestions.get(position);
        holder.Question.setText(item.getQuestion());
        holder.radioButton1.setText(item.getOption1());
        holder.radioButton2.setText(item.getOption2());
        holder.radioButton3.setText(item.getOption3());
        holder.eben = (item.getAnswer());


        if (holder.radioButton1.isChecked()){
            String firstAnswer = holder.radioButton1.getText().toString().trim();
            if (firstAnswer.equals(holder.eben)){
                Toast.makeText(context,"Correct Answer",Toast.LENGTH_SHORT).show();
            }
        }
        if (holder.radioButton2.isChecked()){
            String secondAnswer = holder.radioButton2.getText().toString();
            if (secondAnswer.equals(holder.eben)){
                Toast.makeText(context,"correct Answer",Toast.LENGTH_SHORT).show();
            }
        }
        if (holder.radioButton3.isChecked()){
            String thirdAnswer = holder.radioButton3.getText().toString();
            if (thirdAnswer.equals(holder.eben)){
                Toast.makeText(context,"correct Answer",Toast.LENGTH_SHORT).show();
            }
        }


  }

    @Override
    public int getItemCount() {
        return AllQuestions.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

}
