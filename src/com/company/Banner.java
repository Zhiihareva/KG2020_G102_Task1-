package com.company;

import java.awt.*;

public class Banner implements Drawable{
    private int x,y,w,h;
    private Color c;

    public Banner(int x, int y, int w, int h, Color c){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics2D g){
        drawBanner(g,x,y,w,h, Color.BLACK );
    }
        static void drawBanner(Graphics2D g, int x, int y, int w, int h, Color c){
            g.setColor(Color.white);
            g.fillRect(x+50, y+150, w +50, h+50);
            g.setColor(Color.black);
            g.fillRect(x+110,y+250,w-70,h+50);
            g.drawRect(x+49,y+149,w+52,h+52);
            g.drawString("Съёмочная площадка",x+68,y+200);
            for (int i=0;i<3;i++) {
                g.setColor(Color.BLACK);
                g.drawLine(x+70 + i*60, y+149, x+85+i*60, y+125);
                g.drawRect(x+64+i*60, y+114, w-73, h-23);
                g.setColor(Color.white);
                g.fillRect(x+65+i*60, y+115, w-75, h-25);
            }
        }


}
