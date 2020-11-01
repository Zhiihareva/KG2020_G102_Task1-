package com.company;

import java.awt.*;

public class Sun implements Drawable {
    private final int x;
    private final int y;
    private final int r;
    private final int R;
    private final int n;

    public Sun(int x, int y, int r, int R, int n) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.R = R;
        this.n = n;
    }

    @Override
    public void draw(Graphics2D g) {
        DrawSun(g,x,y,r,R,n);

    }
        public static void DrawSun(Graphics2D g, int x, int y, int r, int R, int n){
            g.setColor(Color.WHITE);
            g.fillOval(x - r, y - r, r + r, r + r);
            double da = 2 * Math.PI / n;
            BasicStroke bs = new BasicStroke(3);
            g.setStroke(bs);

            for ( int i = 0; i < n; i++){
                double dx1 = r * Math.cos(da * i);
                double dy1 = r * Math.sin(da * i);
                double dx2 = R * Math.cos(da * i);
                double dy2 = R * Math.sin(da * i);
                g.drawLine(x + (int)dx1, y + (int)dy1, x + (int)dx2, y + (int)dy2);
            }
        }
    }

