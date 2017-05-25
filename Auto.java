import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Auto extends Hindernis{
    private int[][] hitbox;
    private BufferedImage textur;
    public Auto(){
        try{
            textur = ImageIO.read(new File("sprites/auto1.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Bilder konnten nicht geladen werden.");
        }
    }
}
