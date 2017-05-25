import java.util.Random;
import java.awt.Graphics;
import javax.swing.JLabel;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
public class Liste
{
    private Listenelement erster;
    public Liste(){
        erster = new Abschluss();
        hindernisErzeugen();
    }

    public int abstandBerechnen(int score){
        return (int)(Math.random() * (60)) + 20;
    }

    public void hindernisErzeugen(){//int score){
        //wenn score hoeher, dann abstaende kleiner;
        erster.hindernisSpawnen(abstandBerechnen(Var.char1.scoreGeben()) , new Datenelement(new Kaktus()));//////////////////////////////////////////
    }
}
