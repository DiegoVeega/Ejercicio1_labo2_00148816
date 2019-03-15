package com.example.ejercicioslabo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout mLinearLayout;

    private Button mboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout=findViewById(R.id.ll1);

        mboton=findViewById(R.id.boton);

        mboton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewid=v.getId();


    }
}
