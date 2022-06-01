package com.wxdgut.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.wxdgut.baseapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if(BuildConfig.LOG_DEBUG)
            Toast.makeText(this,"debug",Toast.LENGTH_LONG).show();
        else Toast.makeText(this,"release",Toast.LENGTH_LONG).show();
    }
}