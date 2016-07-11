package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class selectTimesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_times);
    }
    public void onClick(View view) {
        Globals globals = (Globals) this.getApplication();
        switch (view.getId()) {
            case R.id.btnSelectOne:
                globals.times = 1;
                Intent intent1 = new Intent(this, jankenActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnSelectThree:
                globals.times = 3;
                Intent intent3 = new Intent(this, jankenActivity.class);
                startActivity(intent3);
                break;
            case R.id.btnSelectFive:
                globals.times = 5;
                Intent intent5 = new Intent(this, jankenActivity.class);
                startActivity(intent5);
                break;
            case R.id.btnReturn:
                Intent intentR = new Intent(this, startActivity.class);
                startActivity(intentR);
                break;
        }
    }
}
