package com.example.nuri.dooropen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.R.attr.id;

public class LoginActivity extends AppCompatActivity {
    int loginflag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onlgbuttonClicked(View v) {
        EditText idtext = (EditText) findViewById(R.id.idtext);
        EditText pwtext = (EditText) findViewById(R.id.pwtext);
        String id=idtext.getText().toString();
        String pw=pwtext.getText().toString();

        if((id.equals("abc"))&&(pw.equals("1234"))){
            Toast.makeText(getApplicationContext(), "로그인에 성공하였습니다.", Toast.LENGTH_SHORT).show();
            Intent login = new Intent(getApplicationContext(), MainActivity.class);
            loginflag=1;
            login.putExtra("value",loginflag);
            startActivity(login);
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(), "로그인에 실패하였습니다..", Toast.LENGTH_SHORT).show();
            loginflag=0;
        }
    }
}
