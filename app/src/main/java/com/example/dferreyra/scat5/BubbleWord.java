package com.example.dferreyra.scat5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class BubbleWord implements GameObject{

    private Rect rectangleWord;
    private int color;
    private String word;
    private int rectHeight;

    public Rect getRectangleWord(){
        return rectangleWord;

    }

    public BubbleWord(int rectHeight, int color, int startX, int startY, String word){

        this.color=color;
        this.word=word;
        this.rectHeight=rectHeight;
        rectangleWord= new Rect(0,startY,startX,startY+rectHeight);

    }

    @Override
    public void draw(Canvas canvas){
        Paint paint=new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangleWord,paint);
    }

    @Override
    public void update(){

    }




}
