package com.example.nuri.dooropen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EasyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
    }

    public void onOKClicked(View v) {
        EditText pw2text=(EditText) findViewById(R.id.pw2);
        String pw2=pw2text.getText().toString();

        if(pw2.equals("123456")){
            Toast.makeText(getApplicationContext(), "Host 화면으로 갑니다.", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(getApplicationContext(), HostActivity.class);
            startActivity(myIntent);
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(), "다시 눌러주세요", Toast.LENGTH_SHORT).show();
        }
    };
}