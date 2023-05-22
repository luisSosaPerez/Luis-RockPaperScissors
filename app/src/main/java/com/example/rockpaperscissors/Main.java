package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    Button btn_rock, btn_paper, btn_scissors;

    TextView human_score, bot_score;
    ImageView iv_bot, iv_human;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_rock = (Button) findViewById(R.id.btn_rock);
        btn_paper = (Button) findViewById(R.id.btn_paper);
        btn_scissors = (Button) findViewById(R.id.btn_scissors);

        iv_bot = (ImageView) findViewById(R.id.iv_bot);
        iv_human = (ImageView) findViewById(R.id.iv_human);

        human_score = (TextView) findViewById(R.id.human_score);
        bot_score = (TextView) findViewById(R.id.bot_score);

        btn_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_human.setImageResource(R.drawable.paper);
            }
        });
        btn_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_human.setImageResource(R.drawable.rock);
            }
        });
        btn_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_human.setImageResource(R.drawable.scissors);
            }
        });
    }
}