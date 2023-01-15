package com.mi.e020320052.nurannisa.projek82_e020320052;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }

    public void Login(View view) {
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    public void Signup(View view) {
        Intent login = new Intent(this, Signup.class);
        startActivity(login);
    }
}