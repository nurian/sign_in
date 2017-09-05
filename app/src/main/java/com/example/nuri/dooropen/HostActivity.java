package com.example.nuri.dooropen;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HostActivity extends AppCompatActivity {
    int a=0;
    int loginflag;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
    }
    public void onBackPressed(){
        Intent login = new Intent(getApplicationContext(), MainActivity.class);
        loginflag=1;
        login.putExtra("value",loginflag);
        startActivity(login);
        finish();
    }
        public void onButton3Clicked(View v){
        Toast.makeText(getApplicationContext(),"Video가 꺼집니다.",Toast.LENGTH_SHORT).show();
        }

        public void onButton4Clicked(View v) {
            a++;
            if(a%2==1){
                Toast.makeText(getApplicationContext(), "문이 열립니다.", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "문이 닫힙니다.", Toast.LENGTH_SHORT).show();
                a=0;
            }
        }
}