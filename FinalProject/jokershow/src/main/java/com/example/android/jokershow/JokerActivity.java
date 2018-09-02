package com.example.android.jokershow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {

    public static final String KEY_INTENT_JOKE = "joke";

    private TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        mJokeTextView = findViewById(R.id.tv_joke);
//        Get incoming intent
        Intent intent = getIntent();
        if (intent.hasExtra(KEY_INTENT_JOKE)){
            mJokeTextView.setText(intent.getStringExtra(KEY_INTENT_JOKE));
        }else{
            mJokeTextView.setText("No jokes this time.");
        }
    }
}
