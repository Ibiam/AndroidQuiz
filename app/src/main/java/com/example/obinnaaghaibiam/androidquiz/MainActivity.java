package com.example.obinnaaghaibiam.androidquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Button button = (Button) findViewById(R.id.button);

        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int answer11_score;
        int answer12_score;
        int answer13_score;
        int answer14_score;
        int answer15_score;
        int answer16_score;
        int answer17_score;
        int answer18_score;
        int answer19_score;
        int answer20_score;
        int final_score;



        // Question 1 - Correct Answer is Mobile
        String answer1;
        EditText question1_answer = (EditText) findViewById(R.id.question1_answer);
//        answer1 = String.valueOf(question1_answer.getText());
        answer1 = question1_answer.getText().toString();
        if (answer1.equals("Mobile") || answer1.equals("mobile")) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        // Question 2 - Correct Answer is No
        String answer2;
        EditText question2_answer = (EditText) findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString();
        if (answer2.equals("No") || answer2.equals("no")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        // Question 3 - Correct Answer is Padding
        String answer3;
        EditText question3_answer = (EditText) findViewById(R.id.question3_answer);
        answer3 = question3_answer.getText().toString();
        if (answer3.equals("Padding") || answer3.equals("padding")) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        // Question 4 - Correct Answer is #C Open_source Webkit
        Boolean answer4;

        RadioButton question4_choice3 = (RadioButton) this.findViewById(R.id.question4_choice3);
        answer4 = question4_choice3.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        // Question 5 - Correct Answer is #A Linux Kernel
        Boolean answer5;

        RadioButton question5_choice1 = (RadioButton) this.findViewById(R.id.question5_choice1);
        answer5 = question5_choice1.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        // Question 6 - Correct Answer is Google
        String answer6;
        EditText question6_answer = (EditText) findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString();
        if (answer6.equals("Google")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        // Question 7 - Correct Answer is #C Android Inc.
        Boolean answer7;

        RadioButton question7_choice3 = (RadioButton) this.findViewById(R.id.question7_choice3);
        answer7 = question7_choice3.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // Question 8 - Correct Answer is Yes
        String answer8;
        EditText question8_answer = (EditText) findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString();
        if (answer8.equals("Yes") || answer8.equals("yes")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        // Question 9 - Correct Answer is #A Android Interface Definition Language
        Boolean answer9;

        RadioButton question9_choice1 = (RadioButton) this.findViewById(R.id.question9_choice1);
        answer9 = question9_choice1.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        // Question 10 - Correct Answer is Android Debug Bridge
        String answer10;
        EditText question10_answer = (EditText) findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString();
        if (answer10.equals("Android Debug Bridge") || answer10.equals("Android debug bridge")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        // Question 11 - Correct Answer is #C Android Asset Packaging Tool
        Boolean answer11;

        RadioButton question11_choice3 = (RadioButton) this.findViewById(R.id.question11_choice3);
        answer11 = question11_choice3.isChecked();
        if (answer11) {
            answer11_score = 1;
        } else {
            answer11_score = 0;
        }

        // Question 12 - Correct Answer is Logcat
        String answer12;
        EditText question12_answer = (EditText) findViewById(R.id.question12_answer);
        answer12 = question12_answer.getText().toString();
        if (answer12.equals("Logcat") || answer12.equals("logcat")) {
            answer12_score = 1;
        } else {
            answer12_score = 0;
        }

        // Question 13  - Correct Answers are #2, #3 and #4

        Boolean answer13_choice1;
        Boolean answer13_choice2;
        Boolean answer13_choice3;
        Boolean answer13_choice4;

        CheckBox question13_choice1 = (CheckBox) this.findViewById(R.id.question13_choice1);
        answer13_choice1 = question13_choice1.isChecked();

        CheckBox question13_choice2 = (CheckBox) this.findViewById(R.id.question13_choice2);
        answer13_choice2 = question13_choice2.isChecked();

        CheckBox question13_choice3 = (CheckBox) this.findViewById(R.id.question13_choice3);
        answer13_choice3 = question13_choice3.isChecked();

        CheckBox question13_choice4 = (CheckBox) this.findViewById(R.id.question13_choice4);
        answer13_choice4 = question13_choice4.isChecked();

        if (!answer13_choice1 && answer13_choice2 && answer13_choice3 && answer13_choice4) {
            answer13_score = 1;
        } else {
            answer13_score = 0;
        }

        // Question 14 - Correct Answer is #C Java
        Boolean answer14;

        RadioButton question14_choice3 = (RadioButton) this.findViewById(R.id.question14_choice3);
        answer14 = question14_choice3.isChecked();
        if (answer14) {
            answer14_score = 1;
        } else {
            answer14_score = 0;
        }

        // Question 15 - Correct Answer is #C 302.105
        Boolean answer15;

        RadioButton question15_choice3 = (RadioButton) this.findViewById(R.id.question15_choice3);
        answer15 = question15_choice3.isChecked();
        if (answer15) {
            answer15_score = 1;
        } else {
            answer15_score = 0;
        }

        // Question 16 - Correct Answer is #C Their intersection is an empty set
        Boolean answer16;

        RadioButton question16_choice3 = (RadioButton) this.findViewById(R.id.question16_choice3);
        answer16 = question16_choice3.isChecked();
        if (answer16) {
            answer16_score = 1;
        } else {
            answer16_score = 0;
        }

        // Question 17 - Correct Answer is #A x <= 3
        Boolean answer17;

        RadioButton question17_choice1 = (RadioButton) this.findViewById(R.id.question17_choice1);
        answer17 = question17_choice1.isChecked();
        if (answer17) {
            answer17_score = 1;
        } else {
            answer17_score = 0;
        }

        // Question 18 - Correct Answer is #A 3
        Boolean answer18;

        RadioButton question18_choice1 = (RadioButton) this.findViewById(R.id.question18_choice1);
        answer18 = question18_choice1.isChecked();
        if (answer18) {
            answer18_score = 1;
        } else {
            answer18_score = 0;
        }

        // Question 19 - Correct Answer is #B Starts an activity using an implicit intent
        Boolean answer19;

        RadioButton question19_choice2 = (RadioButton) this.findViewById(R.id.question19_choice2);
        answer19 = question19_choice2.isChecked();
        if (answer19) {
            answer19_score = 1;
        } else {
            answer19_score = 0;
        }

        // Question 20 - Correct Answer is Alphabet
        String answer20;
        EditText question20_answer = (EditText) findViewById(R.id.question20_answer);
        answer20 = question20_answer.getText().toString();
        if (answer20.equals("Alphabet")) {
            answer20_score = 1;
        } else {
            answer20_score = 0;
        }

        EditText username = (EditText) findViewById(R.id.name_field_view);
        name = String.valueOf(username.getText());

        final_score = calculateScore(answer1_score, answer2_score, answer3_score, answer4_score, answer5_score, answer6_score, answer7_score, answer8_score, answer9_score, answer10_score, answer11_score, answer12_score, answer13_score, answer14_score, answer15_score, answer16_score, answer17_score, answer18_score, answer19_score, answer20_score);

        displayScore(final_score, name);

    }

    // Final Score

    public int calculateScore(int answer1_score, int answer2_score, int answer3_score, int answer4_score, int answer5_score, int answer6_score, int answer7_score, int answer8_score, int answer9_score, int answer10_score, int answer11_score, int answer12_score, int answer13_score, int answer14_score, int answer15_score, int answer16_score, int answer17_score, int answer18_score, int answer19_score, int answer20_score) {

        int final_score = 0;

        final_score = final_score + answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score + answer11_score +
                answer12_score + answer13_score + answer14_score + answer15_score + answer16_score + answer17_score +
                answer18_score + answer19_score + answer20_score;

        return final_score;
    }

    public void displayScore(int final_score, String name) {
        if (!name.equals("")) {

            if (final_score == 0) {
                Toast.makeText(this, "What happened?, " + name + "! You scored 0 points! You can do better! Try again!", Toast.LENGTH_LONG).show();
            } else if (final_score == 20) {
                Toast.makeText(this, "You got all the answers correct " + name + "! Your score is: " + final_score + "/20. IT'S JUST PERFECT! Congratulations!", Toast.LENGTH_LONG).show();
            } else if (final_score >= 13) {
                Toast.makeText(this, "Good, " + name + "! Your score is: " + final_score + "/20. You answered more than half of the questions correctly!", Toast.LENGTH_LONG).show();
            } else if (final_score > 10) {
                Toast.makeText(this, "You are wonderful " + name + "! Your score is: " +   final_score + "/20. Try again to see whether you can get more answers correct!", Toast.LENGTH_LONG).show();
            } else if (final_score == 10) {
                Toast.makeText(this, "Your are just average " + name + "! Your score is: " + final_score + "/20. Only ten right answer from being perfect!", Toast.LENGTH_LONG).show();
            } else if (final_score <= 9) {
                Toast.makeText(this, "Good try, " + name + "! Your score is: " + final_score + "/20. You can do better! Try again!", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "You need to answer at least the first question!", Toast.LENGTH_LONG).show();
        }
    }


}
