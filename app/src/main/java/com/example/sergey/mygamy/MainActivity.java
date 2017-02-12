package com.example.sergey.mygamy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {



    TextView textView1;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscrin);

         final TextView textView1 = (TextView)findViewById(R.id.textView1);


        Button button5 = (Button)findViewById(R.id.button5);

        Button button6 = (Button)findViewById(R.id.button6);


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("Нажата кнопка 1");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("Нажата самая крутая кнопка 2");
            }
        });




    }


}
