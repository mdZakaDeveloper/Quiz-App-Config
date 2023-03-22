package com.example.chapter4ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes;
    Button no;

    TextView Question;

    //Questions for the Quiz

    private String[] Questions  = {"Java was Invented by James Gosling?", "Java is Procedural Oriented Programming Language?", "Java Supports Multiple inheritance?", "The Java programming language is an example of a compiled language.", "In Java, the \"void\" keyword indicates that a method returns no value.", "Java is Low Level Language? "};

    // Answers for the above questions

    private Boolean[] Answers = {true, false, false, true, true, false};

    //Score

    private int score = 0;

    // indexing
    private int index = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.button);
        no = findViewById(R.id.button2);
        Question = findViewById(R.id.textView2);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if array is not out of bound!
                if(index <= Questions.length-1){
                    // if answer is correct
                    if(Answers[index]){
                        score++;
                    }
                    index++;
                    if(index <= Questions.length-1){
                        Question.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "  + score + "/" + Questions.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if array is not out of bounds
                if(index <= Questions.length-1){
                    // if answer is correct
                    if(!Answers[index] ){
                        score++;
                    }
                    index++;
                    if(index <= Questions.length-1){
                        Question.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "  + score + "/" + Questions.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}