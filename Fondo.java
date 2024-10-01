import javax.swing.*;
import java.awt.*;

public class Fondo {
    //objeto de la clase Juego
    Juego jueguito;
    //variables del tamaño del fondo
    int anchoFondo=1300;
    int altoFondo=400;
    //coordenadas iniciales para mover el Fondo
    int x1=1300;
    int y=0;
    //coordenadas auxiliares que mueven otro fondo
    int x2=0;
    int y2=0;

    public Fondo(Juego jueguito){
        this.jueguito=jueguito;
    }

    public void paint(Graphics2D g){
        ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/multimedia/fondo.jpg"));
        g.drawImage(imagenFondo.getImage(),x1,y1,anchoFondo,altoFondo,null);
        g.drawImage(imagenFondo.getImage(),x2,y2,anchoFondo,altoFondo,null);
    }
}
