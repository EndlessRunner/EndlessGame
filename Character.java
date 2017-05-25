import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public abstract class Character {	

	public abstract void laufen();
	public abstract void sterben();
	public abstract boolean hitscan();
	public abstract int scoreGeben();
	
}
