package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.jokershow.JokerActivity;
import com.example.android.libjokes.Joker;


public class MainActivity extends AppCompatActivity {

    private Joker mJoker;
    private EndpointsAsyncTask mJokesAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJoker = new Joker();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        mJokesAsyncTask = new EndpointsAsyncTask(new AsyncTaskDelegate<String>() {
            @Override
            public void processFinish(String output, Loader<String> callerLoader) {
                Intent intent = new Intent(getApplicationContext(), JokerActivity.class);
                intent.putExtra(JokerActivity.KEY_INTENT_JOKE, output);
                startActivity(intent);
            }
        });
        mJokesAsyncTask.execute(getString(R.string.version));
    }
}
