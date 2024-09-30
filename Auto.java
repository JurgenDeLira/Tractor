import java.awt.event.KeyEvent;

public class Auto {
    //objeto de la clase juego
    Juego jueguito;
    //variables que nos ayudan a saber si el auto salta
    public Auto(Juego jueguito){
        this.jueguito=jueguito;
    }

    public void KeyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_SPACE){

        }
    }
}
