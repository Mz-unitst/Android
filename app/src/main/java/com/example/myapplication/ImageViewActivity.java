package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView mIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv=(ImageView) findViewById(R.id.netimage);
        Toast.makeText(this,"即将获取网络图片",Toast.LENGTH_SHORT).show();
        Glide.with(this).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-06-27%2F5b3345789ca2c.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1673100000&t=0692ad7adc9d94b328b69978dd22fca2").into(mIv);
        Toast.makeText(this,"获取网络图片完成",Toast.LENGTH_SHORT).show();
    }
}