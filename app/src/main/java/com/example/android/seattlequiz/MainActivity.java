package com.example.android.seattlequiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    RadioGroup Q1;
    RadioGroup Q2;
    RadioGroup Q3;
    RadioGroup Q4;
    RadioGroup Q5;
    RadioGroup[] Qs;

    QuestionCard QC1;
    QuestionCard QC2;
    QuestionCard QC3;
    QuestionCard QC4;
    QuestionCard QC5;
    QuestionCard[] allCards;

    TextView Q1Title;
    TextView Q2Title;
    TextView Q3Title;
    TextView Q4Title;
    TextView Q5Title;

    RadioButton Q1aButton;
    RadioButton Q1bButton;
    RadioButton Q1cButton;
    RadioButton Q1dButton;
    RadioButton[] Q1Buttons;
    RadioButton Q2aButton;
    RadioButton Q2bButton;
    RadioButton Q2cButton;
    RadioButton Q2dButton;
    RadioButton[] Q2Buttons;
    RadioButton Q3aButton;
    RadioButton Q3bButton;
    RadioButton Q3cButton;
    RadioButton Q3dButton;
    RadioButton[] Q3Buttons;
    RadioButton Q4aButton;
    RadioButton Q4bButton;
    RadioButton Q4cButton;
    RadioButton Q4dButton;
    RadioButton[] Q4Buttons;
    RadioButton Q5aButton;
    RadioButton Q5bButton;
    RadioButton Q5cButton;
    RadioButton Q5dButton;
    RadioButton[] Q5Buttons;

    Question q1;
    Question q2;
    Question q3;
    Question q4;
    Question q5;
    Question[] qs;

    String answer1;
    String answer2;
    String answer3;
    String answer4;
    String answer5;

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initQuestions();
        initViews();
        initViewAttributes();
    }

    /**
     * Initializes all the questions for loading onto the screen
     */
    private void initQuestions()
    {
        // All the questions and answers
        String title1 = "What is the tallest building in Seattle?";
        answer1 = "The Columbia Center";
        String answer11 = "Seattle Municipal Tower";
        String answer12 = "The Space Needle";
        String answer13 = "The Columbia Center";
        String answer14 = "Safeco Plaza";
        String[] answers1 = {answer11, answer12, answer13, answer14};
        answers1 = shuffleAnswers(answers1);

        String title2 = "What is the body of water Seattle surrounds?";
        answer2 = "Puget Sound";
        String answer21 = "Puget Sound";
        String answer22 = "Duwamish Bay";
        String answer23 = "Pacific Ocean";
        String answer24 = "Coffee Bay";
        String[] answers2 = {answer21, answer22, answer23, answer24};
        answers2 = shuffleAnswers(answers2);

        String title3 = "Which teams plays for the University of Washington?";
        answer3 = "The Huskies";
        String answer31 = "The Vikings";
        String answer32 = "The Huskies";
        String answer33 = "The Hipsters";
        String answer34 = "The Cougars";
        String[] answers3 = {answer31, answer32, answer33, answer34};
        answers3 = shuffleAnswers(answers3);

        String title4 = "Which beach is the most popular in West Seattle?";
        answer4 = "Alki Beach";
        String answer41 = "Alki Beach";
        String answer42 = "Ranier Beach";
        String answer43 = "Lincoln Park";
        String answer44 = "Lowman Beach";
        String[] answers4 = {answer41, answer42, answer43, answer44};
        answers4 = shuffleAnswers(answers4);

        String title5 = "Which tech company does NOT operate in the greater Seattle Area?";
        answer5 = "Apple";
        String answer51 = "Nintendo";
        String answer52 = "Apple";
        String answer53 = "Valve";
        String answer54 = "Microsoft";
        String[] answers5 = {answer51, answer52, answer53, answer54};
        answers5 = shuffleAnswers(answers5);

        q1 = new Question(title1, answer1, answers1);
        q2 = new Question(title2, answer2, answers2);
        q3 = new Question(title3, answer3, answers3);
        q4 = new Question(title4, answer4, answers4);
        q5 = new Question(title5, answer5, answers5);
        qs = new Question[] {q1, q2, q3, q4, q5};

        qs = shuffleQuestions(qs);
    }

    /**
     * Array for shuffling questions
     * @param array - Array of questions
     * @return An array of shuffled questions
     */
    private Question[] shuffleQuestions(Question[] array)
    {
        int index;
        Question temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        return array;
    }

    /**
     * Array for shuffling answers
     * @param array - Array of questions
     * @return An array of shuffled answers
     */
    private String[] shuffleAnswers(String[] array)
    {
        int index;
        String temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        return array;
    }

    /**
     * Initializes variables for holding views
     */
    private void initViews()
    {
        Q1 = findViewById(R.id.question1_answers);
        Q2 = findViewById(R.id.question2_answers);
        Q3 = findViewById(R.id.question3_answers);
        Q4 = findViewById(R.id.question4_answers);
        Q5 = findViewById(R.id.question5_answers);
        Qs = new RadioGroup[] {Q1, Q2, Q3, Q4, Q5};

        Q1Title = findViewById(R.id.question1_text);
        Q2Title = findViewById(R.id.question2_text);
        Q3Title = findViewById(R.id.question3_text);
        Q4Title = findViewById(R.id.question4_text);
        Q5Title = findViewById(R.id.question5_text);

        Q1aButton = findViewById(R.id.answer1a);
        Q1bButton = findViewById(R.id.answer1b);
        Q1cButton = findViewById(R.id.answer1c);
        Q1dButton = findViewById(R.id.answer1d);
        Q1Buttons = new RadioButton[] {Q1aButton, Q1bButton, Q1cButton, Q1dButton};

        Q2aButton = findViewById(R.id.answer2a);
        Q2bButton = findViewById(R.id.answer2b);
        Q2cButton = findViewById(R.id.answer2c);
        Q2dButton = findViewById(R.id.answer2d);
        Q2Buttons = new RadioButton[] {Q2aButton, Q2bButton, Q2cButton, Q2dButton};

        Q3aButton = findViewById(R.id.answer3a);
        Q3bButton = findViewById(R.id.answer3b);
        Q3cButton = findViewById(R.id.answer3c);
        Q3dButton = findViewById(R.id.answer3d);
        Q3Buttons = new RadioButton[] {Q3aButton, Q3bButton, Q3cButton, Q3dButton};

        Q4aButton = findViewById(R.id.answer4a);
        Q4bButton = findViewById(R.id.answer4b);
        Q4cButton = findViewById(R.id.answer4c);
        Q4dButton = findViewById(R.id.answer4d);
        Q4Buttons = new RadioButton[] {Q4aButton, Q4bButton, Q4cButton, Q4dButton};

        Q5aButton = findViewById(R.id.answer5a);
        Q5bButton = findViewById(R.id.answer5b);
        Q5cButton = findViewById(R.id.answer5c);
        Q5dButton = findViewById(R.id.answer5d);
        Q5Buttons = new RadioButton[] {Q5aButton, Q5bButton, Q5cButton, Q5dButton};

        QC1 = new QuestionCard(Q1Title, Q1Buttons);
        QC2 = new QuestionCard(Q2Title, Q2Buttons);
        QC3 = new QuestionCard(Q3Title, Q3Buttons);
        QC4 = new QuestionCard(Q4Title, Q4Buttons);
        QC5 = new QuestionCard(Q5Title, Q5Buttons);

        allCards = new QuestionCard[] {QC1, QC2, QC3, QC4, QC5};
    }

    /**
     * Initializes the attributes of the views
     */
    private void initViewAttributes()
    {
        for(int i = 0; i < allCards.length; i++)
        {
            allCards[i].title.setText(qs[i].title);
            for(int j = 0; j < 4; j++)
            {
                allCards[i].answers[j].setText(qs[i].answers[j]);
            }

        }
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

            if(button != null)
            {
                String answer = button.getText().toString();

                // If the answer matches any of the actual answers
                // then increment the score
                if(answer.equals(answer1)
                        || answer.equals(answer2)
                        || answer.equals(answer3)
                        || answer.equals(answer4)
                        || answer.equals(answer5))
                {
                    score++;
                }
            }
        }

        // Make a toast to display their score
        displayScore(score);

    }

    /**
     * Clears all the checked answers
     * @param view
     */
    public void resetAnswers(View view)
    {
        for(int i = 0; i < Qs.length; i++)
        {
            Qs[i].clearCheck();
        }

        initQuestions();
        initViewAttributes();
    }

    /**
     * Give a toast showing the score
     * @param score
     */
    private void displayScore(int score)
    {
        Context context = getApplicationContext();
        CharSequence text = "You scored a " + score + "/" + Qs.length;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
