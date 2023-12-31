package com.example.eman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView emantext;
    private Button RC_19f19350;
    Button DBChemisitry_19f19350,DBphysics_19f19350,Bupdate_19f19350,CLOSEAPP_19f19350;

    private LinearLayout ChemisitryL,physicsL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ChemisitryL=(LinearLayout)findViewById(R.id.ChemisitryLinearLayout);
        physicsL=(LinearLayout)findViewById(R.id.physicsLinearLayout);
        DBChemisitry_19f19350=(Button)findViewById(R.id.Chemisitrybutton);
        DBphysics_19f19350=(Button)findViewById(R.id.physicsbutton);
        Bupdate_19f19350=(Button)findViewById(R.id.updateB_19f19350);
        RC_19f19350=(Button)findViewById(R.id.RC_19f19350);
        emantext =(TextView) findViewById(R.id.emantext);
        CLOSEAPP_19f19350 =(Button) findViewById(R.id.closeapp);


        RC_19f19350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleTextVisibility();
            }
        });

        // Set up an OnClickListener for the deleteButton
        DBChemisitry_19f19350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Find the parent ViewGroup (e.g., a LinearLayout or a RelativeLayout)
                ViewGroup parentViewGroup = (ViewGroup) ChemisitryL.getParent();

                // Remove the target LinearLayout from its parent
                if (parentViewGroup != null) {
                    parentViewGroup.removeView(ChemisitryL);

                }
            }
        });

        // Set up an OnClickListener for the deleteButton
        DBphysics_19f19350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Find the parent ViewGroup (e.g., a LinearLayout or a RelativeLayout)
                ViewGroup parentViewGroup = (ViewGroup) physicsL.getParent();

                // Remove the target LinearLayout from its parent
                if (parentViewGroup != null) {
                    parentViewGroup.removeView(physicsL);

                }
            }
        });




        ChemisitryL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Handle the click event
                // Start PhpActivity
                Intent intent = new Intent(MainActivity.this, Chemistry.class);
                startActivity(intent);
            }
        });

        physicsL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Handle the click event
                // Start PhpActivity
                Intent intent = new Intent(MainActivity.this, physics.class);
                startActivity(intent);
            }
        });

        Bupdate_19f19350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

        CLOSEAPP_19f19350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });


    }

    private void toggleTextVisibility() {
        if (emantext.getVisibility() == View.VISIBLE) {
            emantext.setVisibility(View.INVISIBLE);
            RC_19f19350.setText("read ");
        } else {
            emantext.setVisibility(View.VISIBLE);
            RC_19f19350.setText("Clear ");
        }


    }
}