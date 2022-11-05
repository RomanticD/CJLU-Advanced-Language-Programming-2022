package Experiment.lab10;

import java.awt.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

/**
 * @author 翟俊华
 * @version 2022.5.20
 */
public class MyFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 400;
    private static final int STRING_X = 210;
    private static final int STRING_Y = 100;
    private static final int FONT_SIZE = 26;
    String fileName = "src/Experiment/lab10/2.gif";

    public static void main(String[] args) throws InterruptedException {
        new MyFrame().getContentPane().add(new MyDrawPanel());
    }

    public MyFrame(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setTitle("我的第一个窗口");
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setSize((int) d.getWidth() * 2 / 3, (int) d.getHeight() * 2 / 3);
        this.setIconImage(new ImageIcon(fileName).getImage());
        this.setVisible(true);
    }

     public static class MyDrawPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            paintString(g);
            paintArrow(g);
            paintRect(g);
            paintOval(g);
            paintCircle(g);
        }

        public static void paintString(Graphics g){
            Graphics2D g1 = (Graphics2D) g;
            g1.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, FONT_SIZE)); // 设置字体
            g1.setColor(Color.red);
            g1.drawString("This is my first graphic: ", STRING_X, STRING_Y); // 绘制文本
        }

        public static void paintArrow(Graphics g){
            Graphics2D g1 = (Graphics2D) g;
            g1.setColor(Color.red);//将颜色作用于绘图上下文
            g1.setStroke(new BasicStroke(2.0f));
            g1.drawLine(270, 200, 470, 200);
            g1.drawLine(450, 180, 470, 200);
            g1.drawLine(450, 220, 470, 200);
        }

        public static void paintRect(Graphics g){
            Graphics2D g1 = (Graphics2D) g;
            g1.setStroke(new BasicStroke(5.0f));
            g1.setColor(new Color(2, 33, 66));
            g1.fillRect(120,180,150,40);
        }

        public static void paintOval(Graphics g){
            Graphics2D g1 = (Graphics2D) g;
            g1.setColor(Color.black);
            g1.drawOval(80,30,570,350);
        }

        public static void paintCircle(Graphics g){
            Graphics2D g1 = (Graphics2D) g;
            g1.setColor(new Color(51, 147, 12));
            g1.drawOval(470,150,100,100);
        }
    }
}



