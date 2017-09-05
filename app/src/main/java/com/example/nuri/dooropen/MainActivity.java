package com.example.nuri.dooropen;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.nuri.dooropen.GuestActivity;
import com.example.nuri.dooropen.HostActivity;
import com.example.nuri.dooropen.LoginActivity;
import com.example.nuri.dooropen.NewIdActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    int loginflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //두번 연속으로 뒤로가기 누를 시 종료
    long pressTime;
    @Override
    public void onBackPressed(){

        long currentTime = System.currentTimeMillis();
        long intervalTime = currentTime - pressTime;

        if(intervalTime <2000){
            super.onBackPressed();
            finishAffinity();
        }else{
            pressTime = currentTime;
            Toast.makeText(this,"한 번 더 누르면 종료됩니다.",Toast.LENGTH_SHORT).show();
        }
    }
    public void onHostClicked(View v) {
        Intent login = getIntent();
        loginflag=login.getIntExtra("value",0);
        if(loginflag==1) {
            Intent myIntent = new Intent(getApplicationContext(), EasyActivity.class);
            startActivity(myIntent);
        }
        else if(loginflag==0){
            Toast.makeText(getApplicationContext(), "로그인이 필요합니다.", Toast.LENGTH_SHORT).show();
        }
    }
    public void onGuestClicked(View v) {
        Intent myIntent = new Intent(getApplicationContext(), GuestActivity.class);
        startActivity(myIntent);
    }
//    login
    public void onbutton2Clicked(View v) {
        Intent myIntent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(myIntent);
    }
//    newid
    public void onbutton3Clicked(View v) {
        Intent myIntent = new Intent(getApplicationContext(), NewIdActivity.class);
        startActivity(myIntent);
    }
}