package com.thedancercodes.geoquiz;

/**
 * Created by @thedancercodes on 20/09/2017.
 */

public class Question {

    // Add 2 member variables and a constructor.
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
