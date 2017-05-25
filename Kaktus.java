import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Kaktus extends Hindernis{
    private int[][] hitbox;
    private BufferedImage textur;
    public Kaktus(){
        try{
            textur = ImageIO.read(new File("sprites/kaktus1.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Bilder konnten nicht geladen werden.");
        }
    }
    
    public BufferedImage bildGeben(){
         return textur;
    }
}
