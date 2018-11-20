package com.example.gbese.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Chala calculate;
Button button1,button2,button3,button4;
TextView bogale;
RadioGroup radiog;
    Intent intent;
RadioButton radio1,radio2;
int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        bogale= (TextView) findViewById(R.id.textView);

        counter=0;
        calculate = new Chala();
       radiog=(RadioGroup) findViewById(R.id.radioGroup2);
          radio1 =(RadioButton) findViewById(R.id.radioButton1);
          radio2= (RadioButton) findViewById(R.id.radioButton2);
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(radio1.isChecked()){
                 calculate.incriment();
                 bogale.setText(Integer.toString(calculate.getvalue()));
             }
             else if(radio2.isChecked()){
                 calculate.incriment();
                 bogale.setText(Integer.toHexString(calculate.getvalue()));
             }
         }
     });



    }


    /*public void plus(View v){
        if(radio1.isChecked()) {
            calculate.incriment();
            bogale.setText(Integer.toString(calculate.getvalue()));
        }
        else if(radio2.isChecked()){
            calculate.incriment();
            bogale.setText(Integer.toHexString(calculate.getvalue()));
        }


    } */
    public void other (View v){
         String lema = bogale.getText().toString();
        intent = new Intent(this,Main2Activity.class);
        intent.putExtra("EXTRA",lema);
        startActivity(intent);

    }



    public void minus(View v){
        if(radio1.isChecked()){
            calculate.decriment();
            bogale.setText(Integer.toString(calculate.getvalue()));
        }
        else if (radio2.isChecked()){
            calculate.decriment();;
            bogale.setText(Integer.toHexString(calculate.getvalue()));

        }
    }
    public void reset(View v){
        calculate.recet();
        bogale.setText(Integer.toString(calculate.getvalue()));
    }

}