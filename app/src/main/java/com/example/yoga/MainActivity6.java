package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity6 extends AppCompatActivity {
    CountDownTimer count;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ImageView imageView=findViewById(R.id.image1);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        String type = getIntent().getStringExtra("2");

        if (type.equals("one")){
            imageView.setImageResource(R.drawable.crossjacks);
        } else if (type.equals("two")) {
            imageView.setImageResource(R.drawable.halfsquat);
        }
        else if (type.equals("three")) {
            imageView.setImageResource(R.drawable.crisscross );
        }
        else if (type.equals("four")) {
            imageView.setImageResource(R.drawable.alternating);
        }
        else if (type.equals("five")) {
            imageView.setImageResource(R.drawable.bicepsstrech);
        }
        else if (type.equals("six")) {
            imageView.setImageResource(R.drawable.shoulder);
        }
        else if (type.equals("seven")) {
            imageView.setImageResource(R.drawable.shrimp);
        }
        else if (type.equals("eight")) {
            imageView.setImageResource(R.drawable.kick);
        }
        else if (type.equals("nine")) {
            imageView.setImageResource(R.drawable.single);
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equalsIgnoreCase("start")) {
                    button1.setText(null);

                    statTimer(60000);
                }
                else if (button2.getText().toString().equalsIgnoreCase("resume")) {
                    resume();
                } else if (button2.getText().toString().equalsIgnoreCase("pause")) {
                    pause();
                }
            }
        });
    }
    long leftmili;
    public void statTimer(long mili){
        count=new CountDownTimer(mili,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                leftmili=millisUntilFinished;
                NumberFormat numberFormat=new DecimalFormat("00");
                long hour=(millisUntilFinished/3600000)%24;
                long min =(millisUntilFinished/60000)%60;
                long sec=(millisUntilFinished/1000)%60;
                button1.setText(numberFormat.format(min)+":"+numberFormat.format(sec));

            }

            @Override
            public void onFinish() {
                button1.setText("00:00");
            }
        }.start();
        button2.setText("pause");
    }
    public void resume(){
    statTimer(leftmili);
    button2.setText("start");
    button2.setEnabled(false);
    button1.setText(null);
    }
    public void pause(){
        count.cancel();
        button2.setText("resume");
    }
}