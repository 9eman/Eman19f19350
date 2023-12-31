package com.example.eman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.app.AlertDialog;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class physics extends AppCompatActivity implements View.OnClickListener{

    TextView emanTQT_19f19350;
    TextView QT_19f19350;
    Button ANSWER_1_19f19350, ANSWER_2_19f19350, ANSWER_3_19f19350, ANSWER_4_19f19350,clear_19350B;
    Button SB_19f19350;

    int Em_19f19350=0;
    int total_19f19350 = QA_19f19350.physicsquestion.length;
    int question_19f19350 = 0;
    String select_19f19350 = "";
    private boolean QR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stylequiz19f19350);

        emanTQT_19f19350 =(TextView) findViewById(R.id.total_question);
        QT_19f19350 = (TextView) findViewById(R.id.question);
        ANSWER_1_19f19350 =(Button) findViewById(R.id.emanA1);
        ANSWER_2_19f19350 =(Button) findViewById(R.id.emanA2);
        ANSWER_3_19f19350 =(Button) findViewById(R.id.emanA3);
        ANSWER_4_19f19350 =(Button) findViewById(R.id.emanA4);
        SB_19f19350 =(Button) findViewById(R.id.eman_submit_B_19f19350);
        clear_19350B=(Button) findViewById(R.id.clear_19350B);

        ANSWER_1_19f19350.setOnClickListener(this);
        ANSWER_2_19f19350.setOnClickListener(this);
        ANSWER_3_19f19350.setOnClickListener(this);
        ANSWER_4_19f19350.setOnClickListener(this);
        SB_19f19350.setOnClickListener(this);
        clear_19350B.setOnClickListener(this);

        emanTQT_19f19350.setText("Total questions : "+total_19f19350);

        new_19f19350();




    }

    @Override
    public void onClick(View view) {

        ANSWER_1_19f19350.setBackgroundColor(Color.WHITE);
        ANSWER_2_19f19350.setBackgroundColor(Color.WHITE);
        ANSWER_3_19f19350.setBackgroundColor(Color.WHITE);
        ANSWER_4_19f19350.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.eman_submit_B_19f19350){
            if(select_19f19350.equals(QA_19f19350.physicscorrectAnswers[question_19f19350])){
                Em_19f19350++;
            }
            question_19f19350++;
            new_19f19350();


        }else if (clickedButton.getId() != R.id.clear_19350B){
            //choices button clicked
            select_19f19350  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }
    public void clearSelection(View view) {
        // Clear the selected answer
        select_19f19350 = "";
        ANSWER_1_19f19350.setBackgroundColor(Color.WHITE);
        ANSWER_2_19f19350.setBackgroundColor(Color.WHITE);
        ANSWER_3_19f19350.setBackgroundColor(Color.WHITE);
        ANSWER_4_19f19350.setBackgroundColor(Color.WHITE);}

    void new_19f19350(){

        if(question_19f19350 == total_19f19350 ){
            finish_19f19350();
            return;
        }

        QT_19f19350.setText(QA_19f19350.physicsquestion[question_19f19350]);
        ANSWER_1_19f19350.setText(QA_19f19350.physicschoices[question_19f19350][0]);
        ANSWER_2_19f19350.setText(QA_19f19350.physicschoices[question_19f19350][1]);
        ANSWER_3_19f19350.setText(QA_19f19350.physicschoices[question_19f19350][2]);
        ANSWER_4_19f19350.setText(QA_19f19350.physicschoices[question_19f19350][3]);

    }

    void finish_19f19350(){
        String pass_19f19350 = "";
        if(Em_19f19350 > total_19f19350*0.60){
            pass_19f19350 = "Passed";
        }else{
            pass_19f19350 = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(pass_19f19350)
                .setMessage("Em_19f19350 is "+ Em_19f19350+" out of "+ total_19f19350)
                .setPositiveButton("Restart",(dialogInterface, i) -> restart_19f19350() )
                .setNegativeButton("Calculate Result", (dialogInterface, i) -> Result19f19350())
                .setCancelable(false)
                .show();


    }

    void restart_19f19350(){
        Em_19f19350 = 0;
        question_19f19350 =0;
        new_19f19350();
    }

    void Result19f19350(){
        double resultPercentage = ((double) Em_19f19350 / total_19f19350) * 100;

        Toast.makeText(this, "Result: " + resultPercentage + "%", Toast.LENGTH_SHORT).show();

        QR= true;

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}