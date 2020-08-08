package com.example.tutorial_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMsg02 = findViewById(R.id.textView2_msg02);
        textMsg02.setText(R.string.textVmsg2);

        Log.i("Message_tag", "onCreate method activated");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Message_tag", "onStart method activated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Message_tag", "onResume method activated");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Message_tag", "onPause method activated");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Message_tag", "onStop method activated");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Message_tag", "onRestart method activated");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Message_tag", "onDestroy method activated");
    }
}