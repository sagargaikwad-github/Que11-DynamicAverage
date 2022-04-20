package com.example.dynamicaverage;


import static android.webkit.ConsoleMessage.MessageLevel.LOG;
import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2,number3;
    TextView avg;
   // int a,b,c;
    float a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        number3=findViewById(R.id.number3);
        avg=findViewById(R.id.average);


        number3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "All Fields Required", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    a=Float.parseFloat(number1.getText().toString());
                    b=Float.parseFloat(number2.getText().toString());
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(number3.getText().toString().isEmpty())
                {
                     //avg.setText("Average : "+String.valueOf((a+b)/2));
                }
                else
                {
                    c=Float.parseFloat(number3.getText().toString());
                    avg.setText("Average : "+String.valueOf((a+b+c)/3));

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(number1.getText().toString().isEmpty() && number2.getText().toString().isEmpty() && number3.getText().toString().isEmpty())
                {
                    avg.setText("Average : 0");
                }
            }

        });

























    }
}