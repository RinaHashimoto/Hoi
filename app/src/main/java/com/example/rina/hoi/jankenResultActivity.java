package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class jankenResultActivity extends AppCompatActivity {
    int imghandComputer;
    int imghandUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         Intent intent = getIntent();
        int handUser = intent.getIntExtra("userHand",0);

        if(handUser == 0){
            imghandUser = R.drawable.rock;
        }else if(handUser == 1){
            imghandUser = R.drawable.scissors;
        }else{
            imghandUser = R.drawable.pepper;
        }

        setContentView(R.layout.activity_janken_result);

        Globals globals = (Globals) this.getApplication();
        TextView textView = (TextView) findViewById(R.id.textView);
        if(globals.jankenResult == 0)textView.setText("しょっ！");
        else textView.setText("ぽん！");

        globals.jankenResult = janken(handUser);

        ImageView imageView0 = (ImageView)findViewById(R.id.imgjankenCompHand);
        ImageView imageView1 = (ImageView)findViewById(R.id.imgjankenUserHand);
        imageView0.setImageResource(imghandComputer);
        imageView1.setImageResource(imghandUser);
    }


    int janken(int handUser){
        Random rand = new Random();
        int handComputer = rand.nextInt(3);
System.out.println("a");
        if(handComputer==0){
            imghandComputer = R.drawable.frog_hand_rock;
        }else if(handComputer==1){
            imghandComputer = R.drawable.frog_hand_scissors;
        }else{
            imghandComputer = R.drawable.frog_hand_paper;
        }
        if(handUser==handComputer){
            return 0;//あいこ
        }else if((handUser==0 && handComputer==1)||(handUser==1 && handComputer==2) ||(handUser==2 && handComputer==0)){
            return 1;//ユーザーの勝ち
        }else{
            return 2;//コンピュータの勝ち
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnToHoi:
                Intent intentTH = new Intent(this, hoiActivity.class);
                startActivity(intentTH);
                break;
        }
    }
}
