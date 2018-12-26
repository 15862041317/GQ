package cn.bdqn.cn.bdqn.game;

/*
* 飞机游戏窗口
* */

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    Image plane=GameUtil.getImage("images/plane.png");
    Image bg=GameUtil.getImage("images/bg.jpg");

    int planex=250,planey=250;

    @Override
    public void paint(Graphics g){       //自动被调用.g相当于一只画笔

        g.drawImage(bg,0,0,null);
        g.drawImage(plane,planex,planey,null);
        planex++;
    }

    class PainThread extends Thread{
        @Override
        public void run(){
            while (true){

                repaint();//重画

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //定义键盘监听
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("按下:"+ e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e){
            System.out.println("按上:"+ e.getKeyCode());
        }


    }


/*
* 初始化窗口
* */
    public void launchFrame(){
        this.setTitle("北大青鸟学员-程序员作品");
        this.setVisible(true);
        this.setSize(500,500);
        //窗口大小设置  宽和高
        this.setLocation(300,300);
        //窗口位置设置  坐标x轴300  y轴300

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
                //关闭窗口时,程序运行结束
            }
        });

        new PainThread().start();//启动重画
        addKeyListener(new KeyMonitor());//增加键盘的监听
    }

    public static void main(String[] args) {
        MyGameFrame f=new MyGameFrame();
        f.launchFrame();

    }
}
