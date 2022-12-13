package com.wecan.notesmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wecan.toast.alert;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert.toastMessage(this,"Catch me! if you can");
    }
}