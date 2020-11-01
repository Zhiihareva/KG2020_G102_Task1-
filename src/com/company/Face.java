package com.company;

import java.awt.*;

public class Face implements Drawable{
    private final int xLZrachok;
    private final int xRZrachok;
    private final int yZrachok;
    private final int yEye;
    private final int xLeft;
    private final int xRight;
    private final int wid;
    private final int hei;
    private final Color c3;

    public Face(int xLZrachok, int xRZrachok, int yZrachok, int yEye, int xLeft, int xRight, int wid, int hei, Color c3){
        this.xLZrachok=xLZrachok;
        this.xRZrachok=xRZrachok;
        this.yZrachok=yZrachok;
        this.yEye=yEye;
        this.xLeft=xLeft;
        this.xRight=xRight;
        this.wid=wid;
        this.hei=hei;
        this.c3=c3;
    }

    @Override
    public void draw(Graphics2D g) {
        DrawFace(g,xLZrachok,xRZrachok,yZrachok,yEye,xLeft,xRight,wid,hei,c3);
    }
    public static void DrawFace(Graphics2D g, int xLZrachok, int xRZrachok, int yZrachok, int yEye, int xLeft, int xRight,
                                int wid, int hei, Color c3){
        g.setColor(c3);
        g.fillRect(xLeft,yEye,wid,hei);
        g.fillRect(xRight,yEye,wid,hei);
        g.setColor(Color.black);
        g.drawLine(xLZrachok,yZrachok,xLZrachok,yZrachok);
        g.drawLine(xRZrachok,yZrachok,xRZrachok,yZrachok);
    }
}
