package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAgain:
                Intent intentA = new Intent(this, selectTimesActivity.class);
                startActivity(intentA);
                break;
        }
    }
}
