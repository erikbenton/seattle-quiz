package com.example.android.seattlequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.example.android.seattlequiz.Question;


public class MainActivity extends AppCompatActivity {

    RadioGroup Q1;
    RadioGroup Q2;
    RadioGroup Q3;
    RadioGroup Q4;
    RadioGroup Q5;
    RadioGroup[] Qs = {Q1, Q2, Q3, Q4, Q5};

    Question q1;
    Question q2;
    Question q3;
    Question q4;
    Question q5;

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initQuestions()
    {
        // All the questions and answers
        String title1 = "What is the tallest building in Seattle?";
        String answer1 = "The Columbia Center";
        String answer11 = "Seattle Municipal Tower";
        String answer12 = "The Space Needle";
        String answer13 = "The Columbia Center";
        String answer14 = "Safeco Plaza";
        String[] answers1 = {answer11, answer12, answer13, answer14};

        String title2 = "What is the body of water Seattle surrounds?";
        String answer2 = "Puget Sound";
        String answer21 = "Puget Sound";
        String answer22 = "Duwamish Bay";
        String answer23 = "Pacific Ocean";
        String answer24 = "Coffee Bay";
        String[] answers2 = {answer21, answer22, answer23, answer24};

        String title3 = "Which teams plays for the University of Washington?";
        String answer3 = "The Huskies";
        String answer31 = "The Vikings";
        String answer32 = "The Huskies";
        String answer33 = "The Hipsters";
        String answer34 = "The Cougars";
        String[] answers3 = {answer31, answer32, answer33, answer34};

        String title4 = "Which beach is the most popular in West Seattle?";
        String answer4 = "Alki Beach";
        String answer41 = "Alki Beach";
        String answer42 = "Ranier Beach";
        String answer43 = "Lincoln Park";
        String answer44 = "Lowman Beach";
        String[] answers4 = {answer41, answer42, answer43, answer44};

        String title5 = "Which tech company does NOT operate in the greater Seattle Area?";
        String answer5 = "Apple";
        String answer51 = "Nintendo";
        String answer52 = "Apple";
        String answer53 = "Valve";
        String answer54 = "Microsoft";
        String[] answers5 = {answer51, answer52, answer53, answer54};

        q1 = new Question(title1, answer1, answers1);
        q2 = new Question(title2, answer2, answers2);
        q3 = new Question(title3, answer3, answers3);
        q4 = new Question(title4, answer4, answers4);
        q5 = new Question(title5, answer5, answers5);
    }

    private void initViews()
    {
        Q1 = findViewById(R.id.question1_answers);
        Q2 = findViewById(R.id.question2_answers);
        Q3 = findViewById(R.id.question3_answers);
        Q4 = findViewById(R.id.question4_answers);
        Q5 = findViewById(R.id.question5_answers);

    }

    /**
     * This checks the submitted answers for correctness
     * @param view
     */
    public void checkAnswers(View view)
    {
        score = 0;

        for(int i = 0; i < Qs.length; i++)
        {
            RadioButton button = findViewById(Qs[i].getCheckedRadioButtonId());
            String answer = button.getText().toString();

            //GET THE SCORE

        }

    }
}
