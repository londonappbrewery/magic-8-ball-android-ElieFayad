package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button answerButton= (Button) findViewById(R.id.answer_button);
        final ImageView answerResult= (ImageView) findViewById(R.id.ball_result);
        final int[] answers = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,
                               R.drawable.ball4,R.drawable.ball5};

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numberGenerator = new Random();
                int imageIndex=numberGenerator.nextInt(5);

                answerResult.setImageResource(answers[imageIndex]);
            }
        });

    }
}
