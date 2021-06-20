package lab6;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    public void paintComponent(Graphics g){
        this.setBackground(Color.WHITE);
        Graphics2D g2 = (Graphics2D)g;
        BasicStroke pen;

        //Буква К 70 max
        g.setColor(Color.BLACK);
        g.drawLine(10,10,10,100);
        g.drawLine(10,55, 50, 10);
        g.drawLine(10,55, 50, 100);

        //Буква О
        pen=new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2.setStroke(pen);
        g.setColor(Color.blue);
        g.drawOval(75, 10, 90,90);

        //Буква Ш
        pen=new BasicStroke(10,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2.setStroke(pen);
        g.setColor(Color.MAGENTA);
        g.drawLine(190,10,190,100);
        g.drawLine(190+20,10,190+20,100);
        g.drawLine(190+40,10,190+40,100);
        g.drawLine(190,100, 230,100);

        //Буква Е
        float[] dash3 = {10, 20,2,20,2,20};
        pen=new BasicStroke(10,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL,1, dash3,0 );
        g2.setStroke(pen);
        g.setColor(Color.yellow);
        g.drawLine(250, 10, 250, 100);
        g.drawLine(250, 10, 290, 10);
        g.drawLine(250, 55, 290, 55);
        g.drawLine(250, 100, 290, 100);


        //Буква Л

        pen=new BasicStroke(3,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2.setStroke(pen);
        g.setColor(Color.red);
        g.drawLine(320,10, 300, 100);
        g.drawLine(320,10, 340, 100);

        //Буква Е

        float[] dash4 = {10, 5,2,10,2,10};
        pen=new BasicStroke(6,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL,1, dash4,0 );
        g2.setStroke(pen);
        g.setColor(Color.GREEN);
        g.drawLine(250+120, 10, 250+120, 100);
        g.drawLine(250+120, 10, 290+120, 10);
        g.drawLine(250+120, 55, 290+120, 55);
        g.drawLine(250+120, 100, 290+120, 100);

        //Буква В

        pen=new BasicStroke(15,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2.setStroke(pen);
        g.setColor(Color.blue);
        g.drawRect(430,10, 50,50);
        g.drawRect(430,60, 70,40);

    }
}
