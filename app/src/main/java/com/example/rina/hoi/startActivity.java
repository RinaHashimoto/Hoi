package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("あっち向いてホイ");
        setContentView(R.layout.activity_start);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonToSelectTimes:
                Intent intentTST = new Intent(this, selectTimesActivity.class);
                startActivity(intentTST);
                break;
        }
    }
}
