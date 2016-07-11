package com.example.rina.hoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Globals globals = (Globals) this.getApplication();
        if(globals.jankenResult == 0){
            Intent intent = new Intent(this, jankenActivity.class);
            startActivity(intent);
        }else if(globals.jankenResult == 1){//ユーザーが指すばん
            setContentView(R.layout.activity_hoi_user);
        }else{//コンピュータが指すばん
            setContentView(R.layout.activity_hoi_comp);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnup:
                Intent intentU = new Intent(this, hoiResultActivity.class);
                intentU.putExtra("dirUser",0);
                startActivity(intentU);
                break;
            case R.id.btndown:
                Intent intentD = new Intent(this, hoiResultActivity.class);
                intentD.putExtra("dirUser",1);
                startActivity(intentD);
                break;
            case R.id.btnleft:
                Intent intentL = new Intent(this, hoiResultActivity.class);
                intentL.putExtra("dirUser",2);
                startActivity(intentL);
                break;
            case R.id.btnright:
                Intent intentR = new Intent(this, hoiResultActivity.class);
                intentR.putExtra("dirUser",3);
                startActivity(intentR);
                break;
        }
    }
}
