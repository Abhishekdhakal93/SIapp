package com.Si.siapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
private Button btnSimpleInterest, btnAddSubtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAddSubtract=findViewById(btnSI);
        btnSimpleInterest=findViewById(btnAddSub);

        
    }
}
