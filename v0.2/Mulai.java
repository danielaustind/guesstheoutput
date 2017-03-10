package com.project.root.guesstheoutput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mulai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mulai);
    }
    public void onClick(View v){
        Intent i = new Intent(this,soalsp1.class);
        startActivity(i);
    }
}
