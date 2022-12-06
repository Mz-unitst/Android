package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv1,mTv2,mTv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv1=findViewById(R.id.tv1);
        mTv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv1.getPaint().setAntiAlias(true);

        mTv2=findViewById(R.id.tv2);
        mTv2.setText(Html.fromHtml("<u>123456</u>"));

        mTv3=findViewById(R.id.tv3);



    }
}