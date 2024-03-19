package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        LinearLayout linearLayout1=findViewById(R.id.mountainclimber);
        LinearLayout linearLayout2=findViewById(R.id.reversecrunch);
        LinearLayout linearLayout3=findViewById(R.id.standingmountain);
        LinearLayout linearLayout4=findViewById(R.id.dips);
        LinearLayout linearLayout5=findViewById(R.id.bicycle);
        LinearLayout linearLayout6=findViewById(R.id.legraise);
        LinearLayout linearLayout7=findViewById(R.id.calfraises);
        LinearLayout linearLayout8=findViewById(R.id.bandraise);
        LinearLayout linearLayout9=findViewById(R.id.squat);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","one");
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","two");
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","three");
                startActivity(intent);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","four");
                startActivity(intent);
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","five");
                startActivity(intent);
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","six");
                startActivity(intent);
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","seven");
                startActivity(intent);
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","eight");
                startActivity(intent);
            }
        });
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("1","nine");
                startActivity(intent);
            }
        });
    }
}