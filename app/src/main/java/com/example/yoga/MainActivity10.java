package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        EditText editText1=findViewById(R.id.edittext1);
        EditText editText2=findViewById(R.id.edittext2);
        Button button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k=editText1.getText().toString();
              String array[]= k.split("'");
              int feet=Integer.parseInt(array[0]);
                int inch=Integer.parseInt(array[1]);
                int total=(feet*12)+inch;
                int cm = (int) (total*2.56);
                editText2.setText(cm+"");
                            }
        });
    }
}