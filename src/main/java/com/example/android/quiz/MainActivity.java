package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ImageView anti = (ImageView) findViewById(R.id.start);

     anti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent antiint = new Intent(MainActivity.this, second.class);

            startActivity(antiint);

        }
    });
}
}