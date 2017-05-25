public class Abschluss extends Listenelement{
    public Abschluss(){        
    }
    public Knoten hindernisSpawnen(int abstand, Datenelement knotenInhalt){
        Knoten neu = new Knoten(abstand, knotenInhalt);
        return neu;
    }
}