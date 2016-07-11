package com.example.rina.hoi;

import android.app.Application;

/**
 * Created by marikonoguchi on 2016/07/10.
 */
public class Globals extends Application {
    //グローバルに使用する変数たち
    int times = 0;//何回戦か
    int jankenResult = 3;//1だとユーザ、2だとコンピュータの勝ち
    int userScore = 0;//ユーザーの得点
    int compScore = 0;//コンピュータの得点

    void reset(){
        jankenResult = 3;
        userScore = 0;
        compScore = 0;
    }
}
