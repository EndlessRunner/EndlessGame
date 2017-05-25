import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class Var{ //Globale Variablen
    static JFrame jf1;
    static int screenwidth = 900, screenheight = 400;
    static int x = 200, y = 300;
    static int speedup = 5 , speeddown = 4 , speedright = 4;
    static int backgroundY1 = 0;//, backgroundY2 = -600;
    static int backgroundspeed = 10;
    static boolean moveright = false, moveup = false; //laufen und jump
    static Label lbl1;
    static BufferedImage ibg1;//, ibg2;
    static Character char1 = new CharUnicorn();//////////
    public Var(){
        try{
            //Background
            ibg1 = ImageIO.read(new File("sprites/Informatk-Bg2(1800x400).png"));
        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Bilder konnten nicht geladen werden.");
        }
    }
}