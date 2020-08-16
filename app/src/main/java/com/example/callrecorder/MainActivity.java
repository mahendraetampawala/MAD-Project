package com.example.callrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView3=findViewById(R.id.textView3);
        textView3.setText("Call Recorder");

        TextView btn1=findViewById(R.id.button1);
        btn1.setText("1");

        TextView btn2=findViewById(R.id.button2);
        btn2.setText("2");

        TextView btn3=findViewById(R.id.button3);
        btn3.setText("3");

        TextView btn4=findViewById(R.id.button4);
        btn4.setText("4");

        TextView btn5=findViewById(R.id.button5);
        btn5.setText("5");

        TextView btn6=findViewById(R.id.button6);
        btn6.setText("6");

        TextView btn7=findViewById(R.id.button7);
        btn7.setText("7");

        TextView btn8=findViewById(R.id.button8);
        btn8.setText("8");

        TextView btn9=findViewById(R.id.button40);
        btn9.setText("9");

        TextView btn0=findViewById(R.id.button0);
        btn0.setText("0");

        button = (Button) findViewById(R.id.button36);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openMainActivity2();


            }
        }
        );
    }

    public void openMainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}