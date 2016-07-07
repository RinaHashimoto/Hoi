package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class jankenResultActivity extends AppCompatActivity {
    int imghandComputer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         Intent intent = getIntent();
        int handUser = intent.getIntExtra("userHand",0);
        int result = janken(handUser);
        System.out.println(result);
        //switch (result) {
           // case 0://あいこ

                //imageView0.setImageResource(imghandComputer);

           // case 1://ユーザーの勝ち

            //case 2://コンピュータの勝ち
        //}
        setContentView(R.layout.activity_janken_result);
        ImageView imageView0 = (ImageView)findViewById(R.id.imgjankenface);
        imageView0.setImageResource(imghandComputer);
    }


    int janken(int handUser){
        Random rand = new Random();
        int handComputer = rand.nextInt(3);
System.out.println("a");
        if(handComputer==0){
            System.out.print("コンピュータはグー　");
            imghandComputer = R.drawable.rock;
        }else if(handComputer==1){
            System.out.print("コンピュータはチョキ　");
            imghandComputer = R.drawable.scissors;
        }else{
           System.out.print("コンピュータはパー　");
            imghandComputer = R.drawable.pepper;
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
