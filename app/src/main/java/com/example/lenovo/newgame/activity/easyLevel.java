package com.example.lenovo.newgame.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.lenovo.newgame.R;

public class easyLevel extends AppCompatActivity implements View.OnClickListener {
    static int moves = 3 ;
    static int goal = 2;
    static int  result = 5 ;
public Button clear,black1,black2,black3 ,b1,b2,b3,b4;
public TextView Result,move;
  public   TextView Level,Goal;
   public TextView myTextView;
    public level ret;
    public int levels_,moves_,goal_,result_,number_;
    String op;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_easy_level );
         clear=(Button)findViewById(R.id.bclear);
        ImageButton setting =(ImageButton)findViewById(R.id.setting);
         black1= (Button)findViewById(R.id.black1);
         black2= (Button)findViewById(R.id.black2);
         black3= (Button)findViewById(R.id.black3);
         b1= (Button)findViewById(R.id.b1);
         b2= (Button)findViewById(R.id.b2);
         b3= (Button)findViewById(R.id.b3);
         b4=(Button)findViewById(R.id.b4);
         Result=(TextView)findViewById(R.id.answer);
         Goal=(TextView)findViewById(R.id.goal);
         Level=(TextView)findViewById(R.id.level);

    Level.setText("LEVEL 1");
//    move.setText("MOVES :"+moves);
    //Result.setText(""+result);
    move = (TextView)findViewById(R.id.moves);
    black1.setOnClickListener(this);
    myTextView = (TextView) findViewById(R.id.answer);

    Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
    myTextView.setTypeface(typeface);
    level level = new level();
    ret = level.level_all ( 1,2,9,0,"*",3  );

}

    @Override
            public void onClick(View v) {
                if (moves > 0) {
                    Button clear=(Button)findViewById(R.id.bclear);
                    TextView Result = (TextView) findViewById(R.id.answer);
                    TextView move = (TextView) findViewById(R.id.moves);

                    switch (v.getId()) {


                        case R.id.black1: {
                            ret = level.level_all ( 1,2,9,0,"*",3 );
                            final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                            mp.start();
                            Result.setText("" + ret.result_f);
                            move.setText("MOVES: " + ret.moves_f);
                            break;
                        }
                        case R.id.black2: {

                            ret = level.level_all ( 1,2,9,0,"*",3  );
                            Result.setText("" + ret.result_f);
                            move.setText("MOVES: " +ret.moves_f);
                            break;
                        }
                        case R.id.black3: {

                            ret = level.level_all ( 1,2,9,0,"*",3  );
                            Result.setText("" + ret.result_f);
                            move.setText("MOVES: " + ret.moves_f);
                            break;
                        }

                    }
                    if (goal == result) {
                        Result.setText("YOU WIN");

                        new Handler().postDelayed( new Runnable() {
                            @Override
                            public void run() {

                            }
                        }, 450);
                    }
                    else{
                        if(moves==0&&goal!=result)
                        {

                            Result.setTextSize(65);
                            Result.setText("YOU LOOSE");
                        }
                    }

                }
            }
}
