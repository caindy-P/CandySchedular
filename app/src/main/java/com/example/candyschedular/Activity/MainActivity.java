package com.example.candyschedular.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.candyschedular.R;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText phoneNumber;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phoneNumber = (EditText)findViewById(R.id.PhoneNumber);
        loginButton = (Button)findViewById(R.id.LoginButton);
    }

    private void loginValidation(String phoneNumber){
        if(phoneNumber == "01012341234"){
            Intent intent = new Intent(MainActivity.this, CalenderActivity.class);
            startActivity(intent);
        }
        else{

        }
    }
}