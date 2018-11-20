package com.example.gbese.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
  TextView chala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent nnew = getIntent();
        String Mamo = nnew.getStringExtra("EXTRA");
        chala =(TextView) findViewById(R.id.textView2);
        chala.setText(Mamo);
    }
}
