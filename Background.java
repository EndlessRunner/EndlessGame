import java.util.Timer;
import java.util.TimerTask;
public class Background{
    Timer back;
    public Background(){
        back = new Timer;
        back.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){

                if(Var.backgroundY1 <380){
                    Var.backgroundY1 += 2;
                } else{
                    Var.backgroundY1 = -400;
                }

            }
        } , 0 , Var.backgroundspeed);
    }
}