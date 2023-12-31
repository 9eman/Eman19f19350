package com.example.eman;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class Splash_19f19350 extends AppCompatActivity {
    Handler eman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash19f19350);
        eman=new Handler();
        eman.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new
                        Intent(Splash_19f19350.this,SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}