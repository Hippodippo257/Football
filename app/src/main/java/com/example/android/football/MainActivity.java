package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.football.R;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for the Steelers.
    int scoreSteelers = 0;

    // Tracks the score for the Patriots.
    int scorePatriots = 0;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * Increase the score for Steelers by 7 points.
     */
    public void addOneForTeamA(View v) {
        int scoreSteelers = scoreSteelers + 7;
        displayForSteelers(scoreSteelers);
    }

    /**
     * Increase the score for Steelers by 3 points.
     */
    public void addTwoForSteelers(View v) {
        int scoreSteelers = scoreSteelers + 3;
        displayForSteelers(scoreSteelers);
    }

    /**
     * Increase the score for Steelers by 2 points.
     */
    public void addThreeForSteelers(View v) {
        int scoreSteelers = scoreSteelers + 2;
        displayForSteelers(scoreSteelers );
    }

    /**
     * Increase the score for Patriots by 7 points.
     */
    public void addOneForPatriots(View v) {
        int scorePatriots = scorePatriots + 7;
        displayForPatriots (scorePatriots);
    }

    /**
     * Increase the score for Patriots by 3 points.
     */
    public void addTwoForPatriots(View v) {
        int scorePatriots = scorePatriots + 3;
        displayForPatriots(scorePatriots);
    }

    /**
     * Increase the score for Patriots by 2 points.
     */
    public void addThreeForPatriots(View v) {
        int scorePatriots = scorePatriots + 2;
        displayForPatriots(scorePatriots);
    }

    public void resetscore(View v) {
        int scoreSteelers = 0;
        int scorePatriots = 0;
        displayForSteelers(scoreSteelers);
        displayForPatriots(scorePatriots);
    }
    /**
     * Displays the given score for Steelers.
     */
    public void displayForSteelers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.steelers_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Patriots.
     */
    public void displayForPatriots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.patriots_score);
        scoreView.setText(String.valueOf(score));
    }



