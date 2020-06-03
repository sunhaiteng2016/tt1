package com.boniu.tt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.boniu.onlyuuid.UUid;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UUid.init(this);
    }
}
