package com.example.dferreyra.scat5;

import java.util.ArrayList;

public class BubbleWordManager {

    private ArrayList<BubbleWord> bubbleWords;
    private int color;
    private int rectHeight;

    private long startTime;


    public BubbleWordManager(int rectHeight, int color){

        this.color=color;
        this.rectHeight=rectHeight;

        startTime=System.currentTimeMillis();

        bubbleWords=new ArrayList<>();

        populateBubbleWords();
    }

    private void populateBubbleWords(){

        int currY=-5*Constants.SCREEN_HEIGHT/4;
        while(currY<0){
            int xStart=(int )(Math.random()*Constants.SCREEN_WIDTH);

            bubbleWords.add(new BubbleWord(rectHeight, color, xStart, currY, "Hello"));
            currY+=rectHeight*4;

        }
    }


    public void update(){

    }

}
