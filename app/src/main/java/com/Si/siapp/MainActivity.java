package com.Si.siapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFirstno, etSecondno, etThirdno;
    private Button btnSimpleInterest;
    int first, second, third, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstno = findViewById(R.id.etFirst);
        etSecondno= findViewById(R.id.etSecond);
        etSecondno=findViewById(R.id.etThird);
        btnSimpleInterest=findViewById(R.id.btnSimpleInterest);

        btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirstno.getText().toString());
                second = Integer.parseInt(etSecondno.getText().toString());
                third= Integer.parseInt(etThirdno.getText().toString());
                result=(first*second*third)/100;

                Toast.makeText(MainActivity.this, "Simple interest is ", Toast.LENGTH_LONG).show();
            }
        });

    }
}
