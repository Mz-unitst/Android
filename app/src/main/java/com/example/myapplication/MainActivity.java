package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_TextView,mBtn_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"cnm sb Android",Toast.LENGTH_SHORT).show();
        mBtn_TextView =(Button) findViewById(R.id.btn_textview);

        mBtn_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtn_Button =(Button) findViewById(R.id.btn_button);

        mBtn_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });

    }
}