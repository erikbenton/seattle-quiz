package com.example.android.seattlequiz;

/**
 * Created by erikbenton on 3/26/18.
 */

public class Question
{
    String title;
    String solution;
    String[] answers;

    public Question(String newTitle, String newSolution, String[] newAnswers)
    {
        title = newTitle;
        solution = newSolution;
        answers = newAnswers;
    }


}
