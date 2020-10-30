import java.awt.Canvas; // importing canvas
import java.awt.Graphics; // importing graphics
import javax.swing.JFrame; // importing JFrame
import java.awt.Color; // importing color
import java.util.Random; // importing random

public class circle_art extends Canvas{

  public static void main(String[] args) {
  
        JFrame frame = new JFrame("Random circles"); //jframe

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when closed exits

        Canvas canvas = new circle_art(); // canvas
        canvas.setSize(800,800); // 800x800 canvas size
        Color bg = new Color(58,64,58); // color named bg
        canvas.setBackground(bg); // canvas background color as bg
        
        frame.add(canvas); // adds canvas
        frame.pack(); 
        frame.setVisible(true); // visible as true
  
  }
  
  public void circle(Graphics j) { // circle method, or function as some people know it
    
    Random gen = new Random(); // random by the name of gen
  
    int x = gen.nextInt(600) + 10; // y cord with random value of 10-610
    int y = gen.nextInt(600) + 10; // x cord with random value of 10 - 610
    int radius = gen.nextInt(150) + 10; // radius of random value of 10-160
    
    int a = gen.nextInt(255); // a with random value of 0-255
    int b = gen.nextInt(255); // b with random value of 0-255
    int c = gen.nextInt(255); // c with random value of 0-255

    Color rand = new Color(a,b,c); // color named rand
    j.setColor(rand); // rand color
    j.fillOval(x,y,radius,radius); // fill oval, or this case, circle
  
  }
  
  
  public void paint(Graphics j) { // paint for the circles
    
    for(int i = 0; i <= 100; i++) // 100 times with counting int i
    circle(j); // does the circle method with Graphics, j
  
  }
  
  
}