package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        LinearLayout linearLayout1=findViewById(R.id.crossjack);
        LinearLayout linearLayout2=findViewById(R.id.jobcross);
        LinearLayout linearLayout3=findViewById(R.id.crisscross);
        LinearLayout linearLayout4=findViewById(R.id.dumble);
        LinearLayout linearLayout5=findViewById(R.id.strech);
        LinearLayout linearLayout6=findViewById(R.id.shoulderstrech);
        LinearLayout linearLayout7=findViewById(R.id.shrimpsquat);
        LinearLayout linearLayout8=findViewById(R.id.kickcrunch);
        LinearLayout linearLayout9=findViewById(R.id.singlestrechleg);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","one");
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","two");
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","three");
                startActivity(intent);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","four");
                startActivity(intent);
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","five");
                startActivity(intent);
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","six");
                startActivity(intent);
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","seven");
                startActivity(intent);
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","eight");
                startActivity(intent);
            }
        });
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity6.class);
                intent.putExtra("2","nine");
                startActivity(intent);
            }
        });
    }
}