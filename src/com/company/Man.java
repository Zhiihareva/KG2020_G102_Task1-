package com.company;

import java.awt.*;

public class    Man implements Drawable{
    private final int xB;
    private final int yBUp;
    private final int yBDown;
    private final int yHand;
    private final int yLHand;
    private final int xLHand;
    private final int xRHand;
    private final int yRHand;
    private final int yLegs;
    private final int xRLeg;
    private final int xLLeg;
    private final int xHead;
    private final int yHead;
    private final int wid;
    private final int hei;

    public Man(int xB, int yBUp, int yBDown, int yHand, int yLHand, int xLHand, int xRHand, int yRHand,
               int yLegs, int xRLeg, int xLLeg, int xHead, int yHead, int wid, int hei){
        this.xB=xB;
        this.yBUp=yBUp;
        this.yBDown=yBDown;
        this.yHand=yHand;
        this.yLHand=yLHand;
        this.xLHand=xLHand;
        this.xRHand=xRHand;
        this.yRHand=yRHand;
        this.yLegs=yLegs;
        this.xRLeg=xRLeg;
        this.xLLeg=xLLeg;
        this.xHead=xHead;
        this.yHead=yHead;
        this.wid=wid;
        this.hei=hei;
    }


    @Override
    public void draw(Graphics2D g) {
                DrawMan(g,xB,yBUp,yBDown,yHand,yLHand,xLHand,xRHand,yRHand,yLegs,xRLeg,xLLeg,xHead,yHead,wid,hei);
    }

    public static void DrawMan(Graphics2D g, int xB, int yBUp, int yBDown, int yHand, int yLHand, int xLHand,
                               int xRHand, int yRHand, int yLegs, int xRLeg, int xLLeg, int xHead, int yHead, int wid, int hei){
        g.setColor(Color.BLACK);
        g.drawLine(xB,yBUp,xB,yBDown);
        g.drawLine(xB,yHand,xLHand,yLHand);
        g.drawLine(xB,yHand,xRHand,yRHand);
        g.drawLine(xB,yBDown,xLLeg,yLegs);
        g.drawLine(xB,yBDown,xRLeg,yLegs);
        g.drawOval(xHead,yHead,wid,hei);
    }

}
