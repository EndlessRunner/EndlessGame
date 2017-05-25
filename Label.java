import java.awt.Graphics;
import javax.swing.JLabel;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
public class Label extends JLabel{
    private static final long serialVersionUTD = 1L; //?

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);    
        g.drawImage(Var.ibg1 , 0, Var.backgroundY1 , 1800,400, null);        
        //Kaktus a = new Kaktus();
        //BufferedImage b = a.bildGeben();
        //g.drawImage(b , 500 , 260 , 60 ,60 , null);

        repaint();
    }
}