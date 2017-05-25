public class Knoten extends Listenelement{
    private Listenelement naechster;
    private Datenelement knoteninhalt;
    private double abstand; //abstand zum vorgaenger;

    public Knoten(double a , Datenelement i){
        knoteninhalt = i;
        abstand = a;
    }   

    public Knoten hindernisSpawnen(int abstand, Datenelement knoteninhalt){
        naechster = naechster.hindernisSpawnen(abstand, knoteninhalt);
        return this;
    }
}