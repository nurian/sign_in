package com.example.nuri.dooropen;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class NewIdActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextId;
    private EditText editTextPassword;
    private EditText editTextSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newid);

        editTextName = (EditText) findViewById(R.id.Name);
        editTextPhone = (EditText) findViewById(R.id.Phone);
        editTextId = (EditText) findViewById(R.id.Id);
        editTextPassword = (EditText) findViewById(R.id.Password);
        editTextSimple = (EditText) findViewById(R.id.Simple);
    }

    public void onNewClicked(View v) {
        Toast.makeText(getApplicationContext(), "회원가입 되었습니다.", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
        finish();
    };
}