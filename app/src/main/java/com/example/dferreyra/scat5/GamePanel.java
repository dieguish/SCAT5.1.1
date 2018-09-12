package com.example.dferreyra.scat5;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {



    //Constructor

    public GamePanel(Context context){
        super(context);


    }

    public void reset(){

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder){

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
     return true;

    }

    public void update(){

    }

    @Override
    public void draw(Canvas canvas){
        super.draw(canvas);

    }

}
