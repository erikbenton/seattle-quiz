package com.example.android.seattlequiz;

import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by erikbenton on 3/27/18.
 */

public class QuestionCard
{

    TextView title;
    RadioButton[] answers;
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;

    public QuestionCard(TextView tempTitle, RadioButton[] tempButtons)
    {
        title = tempTitle;
        answer1 = tempButtons[0];
        answer2 = tempButtons[1];
        answer3 = tempButtons[2];
        answer4 = tempButtons[3];
        answers = new RadioButton[] {answer1, answer2, answer3, answer4};
    }

}
