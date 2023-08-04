package com.example.databindingwithmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingwithmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind= DataBindingUtil.setContentView(this,R.layout.activity_main);
        Productname p=new Productname("Kilah as changed",2);
        bind.setProductname(p);
    }
}