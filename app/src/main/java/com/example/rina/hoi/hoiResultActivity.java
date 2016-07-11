package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class hoiResultActivity extends AppCompatActivity {
    int imgDirComputer;
    Globals globals = (Globals) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int dirUser = intent.getIntExtra("dirUser",0);
        ImageView imageView0;
        int imgDirUser;

        Globals globals = (Globals) this.getApplication();
        if(globals.jankenResult==1){//ユーザーが指すばんだったら
            setContentView(R.layout.activity_hoi_user_result);
            imageView0 = (ImageView)findViewById(R.id.imghoidiruser);
            if(dirUser == 0) imgDirUser = R.drawable.user_finger_up;
            else if(dirUser == 1) imgDirUser = R.drawable.user_finger_down;
            else if(dirUser == 2) imgDirUser = R.drawable.user_finger_left;
            else imgDirUser = R.drawable.user_finger_right;

            if (hoi(dirUser) == 0) globals.userScore = globals.userScore + 1;
        }else{//コンピュータが指すばんだったら
            setContentView(R.layout.activity_hoi_comp_result);
            imageView0 = (ImageView)findViewById(R.id.imghoidiruser);
            if(dirUser == 0) imgDirUser = R.drawable.face_up;
            else if(dirUser == 1) imgDirUser = R.drawable.face_down;
            else if(dirUser == 2) imgDirUser = R.drawable.face_left;
            else imgDirUser = R.drawable.face_right;

            if (hoi(dirUser) == 0) globals.compScore = globals.compScore + 1;
        }

        imageView0.setImageResource(imgDirUser);

        ImageView imageView1 = (ImageView)findViewById(R.id.imghoidircomp);
        imageView1.setImageResource(imgDirComputer);
    }

    int hoi(int dir1) {
        Globals globals = (Globals) this.getApplication();
        Random rand = new Random();
        int dir2 = rand.nextInt(4);
        if(globals.jankenResult == 1) {
            if (dir2 == 0) {
                imgDirComputer = R.drawable.frog_up;
            } else if (dir2 == 1) {
                imgDirComputer = R.drawable.frog_down;
            } else if (dir2 == 2) {
                imgDirComputer = R.drawable.frog_left;
            } else {
                imgDirComputer = R.drawable.frog_right;
            }
        }else{
            if (dir2 == 0) {
                imgDirComputer = R.drawable.frog_hand_up;
            } else if (dir2 == 1) {
                imgDirComputer = R.drawable.frog_hand_down;
            } else if (dir2 == 2) {
                imgDirComputer = R.drawable.frog_hand_left;
            } else {
                imgDirComputer = R.drawable.frog_hand_right;
            }
        }
        if (dir1 == dir2) {
            globals.times = globals.times - 1;
            return 0;//方向が一致した
        } else {
            return 1;//方向が一致しなかった
        }
    }

    public void onClick(View view) {
        Globals globals = (Globals) this.getApplication();
        switch (view.getId()) {
            case R.id.btnToNext:
                    int times = globals.times, userScore = globals.userScore,compScore = globals.compScore;
                if(times == 0 || (((times==1)&&(userScore==2||compScore==2))&&!(times==1&&userScore==2&&compScore==2)) || ((times==2)&&(userScore==3||compScore==3))||((times==1)&&(userScore==3||compScore==3))){
                    Intent intentR = new Intent(this, resultActivity.class);
                    startActivity(intentR);
                    break;
                }else{
                    Intent intentJ = new Intent(this,jankenActivity.class);
                    startActivity(intentJ);
                    break;
                }

        }
    }
}
