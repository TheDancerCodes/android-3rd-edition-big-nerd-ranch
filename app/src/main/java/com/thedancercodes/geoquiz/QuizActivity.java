package com.thedancercodes.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * CHALLENGE: Customizing the Toast
 *
 * 1) You are to customize the toast to show at the top instead of the bottom of the screen.
 *
 * 2) To change how the toast is displayed, use the Toast class's setGravity method.
 *
 * 3) Use Gravity.TOP for the gravity value.
 *
 * 4) Refer to the developer documentation at
 * https://developer.android.com/reference/android/widget/Toast.html#setGravity(int, int, int)
 * for more details.
 */

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(QuizActivity.this,
                               R.string.correct_toast,
                               Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 200);
                toast.show();
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(QuizActivity.this,
                               R.string.incorrect_toast,
                               Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 200);
                toast.show();
            }
        });
    }
}
