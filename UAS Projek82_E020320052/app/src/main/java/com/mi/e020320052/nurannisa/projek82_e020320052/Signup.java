package com.mi.e020320052.nurannisa.projek82_e020320052;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ScrollView scrollView = (ScrollView) findViewById(R.id.sc_signup);
        scrollView.setEnabled(false);

    }

    public void signup(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}