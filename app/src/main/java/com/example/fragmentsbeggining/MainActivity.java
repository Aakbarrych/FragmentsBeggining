package com.example.fragmentsbeggining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.up, new UpFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.down, new DownFragment()).commit();
    }
}