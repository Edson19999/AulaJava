package Edson;

import java.awt.Color;
    import java.awt.Graphics;
    import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App extends JFrame{
    public static void main( String[] args )
    {
        new App();
    }
    
    public App(){
        setSize(1000,500);
        setVisible(true);
    }
    
    public void paint (Graphics g){
        
        g.drawRect(50,50,100,200);
        
        g.setColor(new Color(25,25,255));
        g.drawOval(200,50,50,50);
        
        g.setColor(Color.BLUE);
        g.fillRect(50,200,100,25);
        
        g.setColor(Color.BLACK);
        g.drawString("My string", 200,200);
    }
}
