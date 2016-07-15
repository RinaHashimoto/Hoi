package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textView = (TextView) findViewById(R.id.textresult);
        Globals globals = (Globals) this.getApplication();
        if(globals.compScore>globals.userScore){
            textView.setText(globals.userScore+"対"+globals.compScore+"であなたの負け!");
        }else{
            textView.setText(globals.userScore+"対"+globals.compScore+"であなたの勝ち!");
        }
    }

    public void onClick(View view) {
        Globals globals = (Globals) this.getApplication();
        globals.reset();
        switch (view.getId()) {
            case R.id.btnAgain:
                Intent intentA = new Intent(this, selectTimesActivity.class);
                startActivity(intentA);
                break;
        }
    }
}
