import java.util.Timer;
import java.util.TimerTask;
public class PlayerMovement{
    Timer movement;
    public Background(){
        movement = new Timer;
        movement.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                if(Var.moveup == true){
                    if(Var.y > 0){
                        Var.y -= Var.speedup;
                    }
                }else if(Var.movedown == true){
                    if(Var.y <= 300){
                        Var.y += Var.speeddown;
                    }
                }

                if(Var.moveright == true){
                    if(Var.x <= 800){
                        Var.x -= Var.speedright;
                    }
            }

        }, 0 , 10);
    }
}