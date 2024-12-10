import java.applet.Applet;
import java.awt.*;

public class DiaGonalLogo extends Applet implements Runnable{
    private int x =  0, y = 0;
    private int width, height;
    private Thread t;
     
    @Override 
    public void init(){
        width = getWidth();
        height = getHeight();

        t = new Thread(this);
        t.start();
    }

    @Override
    public void paint(Graphics g){
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("np",x,y);
    }

    public void run(){

        while(true){
            x = x+5;
            y = y+5;
            if(x > width || y > height ){
                x = 0;
                 y = 0;
            }
            repaint();
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.PrintStackTrace();
            }
        }
        
    }
}