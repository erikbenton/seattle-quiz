package com.example.android.seattlequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This checks the submitted answers for correctness
     * @param view
     */
    public void checkAnswers(View view)
    {

    }
}
