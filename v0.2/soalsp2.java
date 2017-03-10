package com.project.root.guesstheoutput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class soalsp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalsp2);
    }
    public void next(View v){
        Intent i = new Intent(this,soalsp3.class);
        startActivity(i);
    }
    public void back(View v){
        Intent i = new Intent(this,soalsp1.class);
        startActivity(i);
    }


}
