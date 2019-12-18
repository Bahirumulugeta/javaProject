package study;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Formatter;
public class Bounce extends JPanel{
    static final int _width=1000;
    static final int _height=500;
    
    private static float ballraddis=20;
    private static float ballx=ballraddis+50;
    private static float bally=ballraddis+20;
    private static float ballspeedx=18;
    private static float ballspeedy=52;
    private static final int update_rate=30;
    private static int x=200,y=400;
    
    public Bounce()
    {
        setSize(_width,_height);
        this.setPreferredSize(new Dimension(_width,_height));
        
        Thread game=new Thread()
        {
            public void run()
            {
                while(true)
                {
                    ballx+=ballspeedx;
                    bally+=ballspeedy;
                    if(ballx-ballraddis<0)
                    {
                        ballspeedx=-ballspeedx;
                        ballx=ballraddis;
                    }
                    else if(ballx+ballraddis>_width)
                    {
                        ballspeedx=-ballspeedx;
                        ballx=_width-ballraddis;
                    }
                    if(bally-ballraddis<0)
                    {
                        ballspeedy=-ballspeedy;
                        bally=ballraddis;
                    }
                    else if(bally+ballraddis>_height)
                    {
                        ballspeedy=-ballspeedy;
                        bally=_height-ballraddis;
                    }
                    repaint();//refresh display
                    try{
                        Thread.sleep(1000/update_rate);
                    }catch(InterruptedException e){};
                }
            }
        };
        game.start();
       
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, _width, _height);
        //design the ball
        
        //g.setColor(Color.BLUE);
       // g.fillOval((int)(ballx-ballraddis),(int)(bally-ballraddis),(int)(2*ballraddis), (int)(2*ballraddis));
        
        
        
        //design the controller
        
        
        
        
        g.setColor(Color.red);
        g.fillRect(x, y, 50, 30);
        /* addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e){
                
            } 
            public void mouseMoved(MouseEvent e){
                int a=e.getX();
                int b=e.getY();
                
                if(x==ballx)
                    System.out.print("yes");
            }
         });*/
         
         KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher(){
             public boolean dispatchKeyEvent(KeyEvent e){
                 int key=e.getKeyCode();
                 switch(key)
                 {
                     case KeyEvent.VK_RIGHT:
                     int velx=1;
                      x=x+velx;
                      break;
                     case KeyEvent.VK_LEFT:
                      int velofx=-1;
                      x=x+velofx;
                      break;
                 }
                 
                 return false;
             }
             
         });
        
         
    }  
   /* public void actionPerformed(ActionEvent e){
        x=x+velx;
        y=y+vely;
        repaint();
    }
    
    public void keyTyped(){};
    public void keyReleased(){};*/
}