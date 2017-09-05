package com.example.nuri.dooropen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GuestActivity extends AppCompatActivity {
    int a=0;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
    }
    public void onButton5Clicked(View v) {
        a++;
        if (a % 2 == 1) {
            Toast.makeText(getApplicationContext(), "집주인과 연결합니다.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "연결이 끊깁니다.", Toast.LENGTH_SHORT).show();
            a = 0;
        }
    }
}