package android.example.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Display the given score for Team A.
     * @param value
     */
    public void displayForTeamA(int value){
        TextView txtScore = (TextView)findViewById(R.id.score_a);
        txtScore.setText(String.valueOf(value));
    }

    /**
     * Display the given score for Team B.
     * @param value
     */
    public void displayForTeamB(int value){
        TextView txtScore = (TextView)findViewById(R.id.score_b);
        txtScore.setText(String.valueOf(value));
    }

    /**
     * This method add three points to global score for the Team A.
     * @param view
     */
    public void addThreePointsA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method add two points to global score for the Team A.
     * @param view
     */
    public void addTwoPointsA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method add two point to global score for the Team A.
     * @param view
     */
    public void addOnePointA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method add three points to global score for the Team B.
     * @param view
     */
    public void addThreePointsB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method add two points to global score for the Team B.
     * @param view
     */
    public void addTwoPointsB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method add two point to global score for the Team B.
     * @param view
     */
    public void addOnePointB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score.
     * @param view
     */
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
