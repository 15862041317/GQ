package cn.bdqn.cn.bdqn.game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
    boolean left,up,right,down;


    @Override
    public void drawSelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
        x++;
    }
    public Plane(Image img,double x,double y){
        this.img=img;
        this.x=x;
        this.y=y;
    }

    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case 37:
                left=true;
                break;
            case 38:
                up=true;
                break;
            case 39:
                right=true;
                break;
            case 40:
                down=true;
                break;
                default:
        }
    }
}
