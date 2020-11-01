package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final Color c3 = new Color(42, 165, 48, 255);
    private final Sun s = new Sun(900, 0, 100, 200, 0);
    private final Man m = new Man(500,300,420,330,300,420,400,
            300,500,540,460, 475, 250,50,50);
    private final Background bc = new Background(0,0,1300,600,0,
            500,1300,400);
    private final Face f = new Face(516,488,268,265,513,485,7,7,c3);
    private final Banner ban = new Banner(50, 200, 100, 50, Color.BLACK);



    @Override
    public void paint(Graphics g) {
        Color c4 = new Color(128, 128, 128);
        Color c9 = new Color (105,105,105);
        Color c10 = new Color(34,139,34);
        Graphics2D gr = (Graphics2D) g;
        bc.draw(gr);
        s.draw(gr);

        for (int i = 0; i < 3 ; i++){
            if (i / 2 == 1){
                gr.setColor(c9);
                gr.fillPolygon(new int[]{i * 100, 200 + i * 100, 400 + i * 100}, new int[]{500, 200, 500}, 3);
                gr.setColor(Color.WHITE);
                gr.fillPolygon(new int[]{133 + i * 100, 200 + i * 100, 267 + i * 100}, new int[]{300, 200, 300}, 3);
                gr.setColor(c9);
                gr.fillPolygon(new int[]{400 + i * 100, 600 + i * 100, 800 + i * 100}, new int[]{500, 200, 500}, 3);
                gr.setColor(Color.WHITE);
                gr.fillPolygon(new int[]{133 + i * 100, 200 + i * 100, 267 + i * 100}, new int[]{300, 200, 300}, 3);

            }
            else {
                gr.setColor(c4);
                gr.fillPolygon(new int[]{i * 400, 200 + i * 400, 400 + i * 400}, new int[]{500, 200, 500}, 3);
                gr.setColor(Color.WHITE);
                gr.fillPolygon(new int[]{133 + i * 400, 200 + i * 400, 267 + i * 400}, new int[]{300, 200, 300}, 3);
            }


        }
        ban.draw(gr);
        for (int i=0;i<50;i++){
            gr.setColor(c10);
            gr.drawLine(i * 40,550,20+i*40,490);
            gr.drawLine(i * 40,650,20+i*40,590);
            gr.drawLine(10+i*40,600,30+i*40,540);
            gr.drawLine(20+i*40,490,40+i*40,550);
            gr.drawLine(20+i*40,590,40+i*40,650);
            gr.drawLine(30+i*40,540,50+i*40,600);



        }
        m.draw(gr);
        f.draw(gr);
        ban.draw(gr);

    }
}
