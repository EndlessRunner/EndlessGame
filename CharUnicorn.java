import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class CharUnicorn extends Character{
    private int geschwidigkeit;
    private boolean tot;
    private int sprunghoehe;
    private int positionX, positionY;
    private BufferedImage textur;
    private int score;
    public CharUnicorn(){
        try{
            textur = ImageIO.read(new File("sprites/char1.png"));
        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Bilder konnten nicht geladen werden.");
        }
    }
    
    public int scoreGeben(){
        return score;
    }

    public void laufen(){

    }

    public void sterben(){

    }

    public boolean hitscan(){
        return false;
    }
    
    
}
