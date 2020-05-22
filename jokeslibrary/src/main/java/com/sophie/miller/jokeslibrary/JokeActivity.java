package com.sophie.miller.jokeslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    TextView jokeTV;
    String joke = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if(intent.hasExtra("joke")){
            joke = intent.getStringExtra("joke");
        }

        jokeTV = findViewById(R.id.activity_joke_joke_tv);
        jokeTV.setText(joke);
    }

    public String getJoke() {
        return joke;
    }
}
