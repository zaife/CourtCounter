package me.zaife.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;

    private int teamBScore = 0;

    private TextView textViewA;
    private TextView textViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewA = (TextView) findViewById(R.id.score_team_a);
        textViewB = (TextView) findViewById(R.id.score_team_b);
    }

    private void displayScoreForA(){
        //TextView textView = (TextView) findViewById(R.id.score_team_a);
        textViewA.setText(String.valueOf(teamAScore));
    }

    private void displayScoreForB(){
        //TextView textView = (TextView) findViewById(R.id.score_team_b);
        textViewB.setText(String.valueOf(teamBScore));
    }

    public void addThreePointsForA(View view){
        teamAScore = teamAScore + 3;
        displayScoreForA();
    }
    public void addTwoPointsForA(View view){
        teamAScore = teamAScore + 2;
        displayScoreForA();
    }
    public void addFreePointsForA(View view){
        teamAScore = teamAScore + 1;
        displayScoreForA();
    }

    public void addThreePointsForB(View view){
        teamBScore = teamBScore + 3;
        displayScoreForB();
    }
    public void addTwoPointsForB(View view){
        teamBScore = teamBScore + 2;
        displayScoreForB();
    }
    public void addFreePointsForB(View view){
        teamBScore = teamBScore + 1;
        displayScoreForB();
    }

    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayScoreForA();
        displayScoreForB();
    }
}
