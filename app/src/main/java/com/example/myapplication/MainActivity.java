package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_TextView,mBtn_Button,mBtn_EditText,mBtn_RadioButton,mBtn_CheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this,"cnm sb Android",Toast.LENGTH_SHORT).show();

        mBtn_TextView =(Button) findViewById(R.id.btn_textview);
        mBtn_Button =(Button) findViewById(R.id.btn_button);
        mBtn_EditText=(Button) findViewById(R.id.btn_editext);
        mBtn_RadioButton=(Button) findViewById(R.id.btn_radiobutton);
        mBtn_CheckBox=(Button) findViewById(R.id.btn_checkbox);
        setListeners();
        }

    private void setListeners(){
        OnClick onClick =new OnClick();
        mBtn_RadioButton.setOnClickListener(onClick);
        mBtn_Button.setOnClickListener(onClick);
        mBtn_EditText.setOnClickListener(onClick);
        mBtn_TextView.setOnClickListener(onClick);
        mBtn_CheckBox.setOnClickListener(onClick);
    }
    private class OnClick implements  View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_textview:
                    intent =new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent =new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_editext:
                    intent =new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent =new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent=new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}