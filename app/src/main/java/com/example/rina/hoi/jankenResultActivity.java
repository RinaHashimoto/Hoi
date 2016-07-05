package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class jankenResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janken_result);
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
