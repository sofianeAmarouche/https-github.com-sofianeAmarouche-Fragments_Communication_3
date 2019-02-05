package com.example.sofiane.fragments_communication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment_One.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void send(String userContent) {
        Fragment_Two secondFragment = (Fragment_Two) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        secondFragment.updateTextField(userContent);
    }
}
