package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hoiResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoi_result);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnToResult:
                Intent intentTR = new Intent(this, resultActivity.class);
                startActivity(intentTR);
                break;
        }
    }
}
