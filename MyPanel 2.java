package com.hspedu.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    public  MyPanel() {

        hero = new Hero(100, 100);
        hero.setSpeed(1);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        drawTank(hero.getX(), hero.getY(), g,  hero.getDirect(), 1);

        //画出坦克

    }
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x+30, y, 10, 60, false);
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y+30, x+20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y+20, x+60, y+20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x+30, y, 10, 60, false);
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y+30, x+20, y+60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y+20, x, y+20);
                break;


            default:
                System.out.println("暂时没有处理");


        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
//处理键
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        }else if(e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        }else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        }else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }

        this.repaint();


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
