package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox mCb4,mCb5,mCb6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        mCb4=findViewById(R.id.cb_4);
        mCb5=findViewById(R.id.cb_5);
        mCb6=findViewById(R.id.cb_6);
        mCb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {//b表示是否选中
                Toast.makeText(CheckBoxActivity.this,b?"4选中":"4未选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}