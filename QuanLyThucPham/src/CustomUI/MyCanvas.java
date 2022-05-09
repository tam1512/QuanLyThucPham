/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomUI;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author blemb
 */
public class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {  

        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("img/images.jpg");  
        g.drawImage(i, 120,100,this);  

    }  
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
}
