package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoi);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnup:
                Intent intentU = new Intent(this, hoiResultActivity.class);
                startActivity(intentU);
                break;
            case R.id.btndown:
                Intent intentD = new Intent(this, hoiResultActivity.class);
                startActivity(intentD);
                break;
            case R.id.btnleft:
                Intent intentL = new Intent(this, hoiResultActivity.class);
                startActivity(intentL);
                break;
            case R.id.btnright:
                Intent intentR = new Intent(this, hoiResultActivity.class);
                startActivity(intentR);
                break;
        }
    }
}
