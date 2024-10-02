import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class Auto {
    //objeto de la clase juego
    Juego jueguito;
    //variables que nos ayudan a saber si el auto salta
    static boolean saltando=false;
    boolean sube=false;
    boolean baja=false;
    //variables que delimitan el area del objeto
    Area llantaDelantera, llantaTrasera, carroceria, tractor;
    //variables de tamaño del personaje
    int anchoPersonaje=112;
    int altoPersonaje=78;
    //coordenadas iniciales de personaje
    static int x_inicial=50;
    static int y_inicial =270;
    //coordenadas para manipulaer el personaje
    int x_auxiliar=0;
    int y_auxiliar=0;

    public Auto(Juego jueguito){
        this.jueguito=jueguito;
    }

    public void mover(){
        if(x_inicial+x_auxiliar>0 && x_inicial+x_auxiliar<jueguito.getWidth()-anchoPersonaje){
            x_inicial+=x_auxiliar;
        }
        if(saltando){
            if(y_inicial ==270){
                sube=true;
                y_auxiliar=-2;
                baja=false;
            }
            if(y_inicial ==150){
                baja=true;
                y_auxiliar=2;
                sube=false;
            }
            if(sube) {
                y_inicial+=y_auxiliar;
            }
            if(baja){
                y_inicial+=y_auxiliar;
                if(y_inicial==270){//si el auto llegó al suelo
                    saltando=false;
                }

            }
        }
    }

    public void paint(Graphics2D g){
        ImageIcon auto=new ImageIcon(getClass().getResource("/multimedia/tractor.png"));
        g.drawImage(auto.getImage(), x_inicial, y_inicial,anchoPersonaje,altoPersonaje,null);
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            saltando=true;


        }
    }

    public Area getBounds(){
        Rectangle formal=new Rectangle(x_inicial,y_inicial,95,62);
        carroceria=new Area(formal);

        Ellipse2D forma2=new Ellipse2D.Double(x_inicial,y_inicial+28,48,48);
        llantaTrasera=new Area(forma2);

        Ellipse2D forma3=new Ellipse2D.Double(x_inicial+73,y_inicial+39,38,38);
        llantaDelantera=new Area(forma3);

        tractor=carroceria;
        tractor.add(carroceria);
        tractor.add(llantaTrasera);
        tractor.add(llantaDelantera);

        return tractor;

    }

}
