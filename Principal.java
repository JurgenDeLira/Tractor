import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Jueguito");
        Juego jueguito = new Juego();
        ventana.add(jueguito);
        ventana.setSize(1300,400);
        ventana.setLocation(70,200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            jueguito.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }


        }


    }
}
