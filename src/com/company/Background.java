package com.company;

import java.awt.*;

public class Background implements Drawable {
    private final int xNebo;
    private final int yNebo;
    private final int widNebo;
    private final int heiNebo;
    private final int xGround;
    private final int yGround;
    private final int widGround;
    private final int heiGround;

    public Background(int xNebo, int yNebo, int widNebo, int heiNebo, int xGround, int yGround, int widGround,
                      int heiGround){

        this.xNebo=xNebo;
        this.yNebo=yNebo;
        this.widNebo=widNebo;
        this.heiNebo=heiNebo;
        this.xGround=xGround;
        this.yGround=yGround;
        this.widGround=widGround;
        this.heiGround=heiGround;
    }

    @Override
    public void draw(Graphics2D g) {
        DrawBackground(g,xNebo,yNebo,widNebo,heiNebo,xGround,yGround,widGround,heiGround);
    }
    public static void DrawBackground(Graphics2D g, int xNebo, int yNebo, int widNebo, int heiNebo, int xGround, int yGround, int widGround,
                                      int heiGround){
        g.setColor(Color.BLACK);
        g.fillRect(xNebo,yNebo,widNebo,heiNebo);
        g.setColor(Color.GREEN);
        g.fillRect(xGround,yGround,widGround,heiGround);
    }
}
