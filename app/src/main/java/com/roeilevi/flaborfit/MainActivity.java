package com.roeilevi.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout weightBtn;
    RelativeLayout yogaBtn;
    RelativeLayout cardioBtn;

    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightBtn = (RelativeLayout) findViewById(R.id.weightBtn);
        yogaBtn = (RelativeLayout) findViewById(R.id.yogaBtn);
        cardioBtn = (RelativeLayout) findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);

            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadDetailActivity(MainActivity.EXERCISE_YOGA);

            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadDetailActivity(MainActivity.EXERCISE_CARDIO);

            }
        });
    }

    private void loadDetailActivity(String exerciseTitle){



    }
}
