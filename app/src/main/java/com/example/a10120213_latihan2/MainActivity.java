package com.example.a10120213_latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    public void btnRegister(View view){
        Intent intent = new Intent(this, com.example.a10120213_latihan2.RegisterActivity.class);
        startActivity(intent);
    }
}