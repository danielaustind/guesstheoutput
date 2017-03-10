package com.project.root.guesstheoutput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class soalsp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalsp1);
    }
    public void next(View v){
        Intent i = new Intent(this,soalsp2.class);
        startActivity(i);
    }

}
