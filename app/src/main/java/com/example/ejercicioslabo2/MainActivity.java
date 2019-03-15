package com.example.ejercicioslabo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.ejercicioslabo2.R.id.user;

public class MainActivity extends AppCompatActivity{

    private Button mboton;
    private EditText muser;
    private EditText mpass;
    private TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        muser=findViewById(R.id.user);
        mpass=findViewById(R.id.pass);
        mboton=findViewById(R.id.boton);
        mtext=findViewById(R.id.idtext);

        mboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtext.setText(muser.getText());
            }
        });

        mboton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mtext.setText(mpass.getText());
                mboton.setText("Long Click");
                return true;
            }
        });

    }
}
