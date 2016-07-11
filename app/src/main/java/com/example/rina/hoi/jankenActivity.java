package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jankenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janken);

        Globals globals = (Globals) this.getApplication();
        TextView textView = (TextView) findViewById(R.id.textjanken);
        if(globals.jankenResult == 0){
            textView.setText("あ〜いこ〜で");
        }else{
            textView.setText("じゃ〜んけ〜ん");
        }

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btngu:
                Intent intentG = new Intent(this, jankenResultActivity.class);
                intentG.putExtra("userHand",0);
                startActivity(intentG);
                break;
            case R.id.btnchoki:
                Intent intentC = new Intent(this, jankenResultActivity.class);
                intentC.putExtra("userHand",1);
                startActivity(intentC);
                break;
            case R.id.btnpa:
                Intent intentP = new Intent(this, jankenResultActivity.class);
                intentP.putExtra("userHand",2);
                startActivity(intentP);
                break;
        }
    }

}
