import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class Juego extends JPanel {

    //sonido del juego

    URL direccionSonidoSalto,direccionSonidoChoque;
    AudioClip sonidoChoque,sonidoSalto;

    //objetos de las clases auto, obstaculo y fondo

    Auto auto=new Auto(this);
    Obstaculo obstaculo=new Obstaculo(this);
    Fondo fondo=new Fondo(this);

    //variables para el juego
    static boolean juegoFinalizado=false;
    static boolean pierdeVida=false;
    static int vidas=3;
    static int puntos=0;
    static int nivel=1;

    public Juego(){
        direccionSonidoChoque=getClass().getResource("/multimedia/choque.wav");
        sonidoChoque= Applet.newAudioClip(direccionSonidoChoque);

        direccionSonidoSalto=getClass().getResource("multimedia/salto.wav");
        sonidoSalto=Applet.newAudioClip(direccionSonidoSalto);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // el salto se activa cuando se presiona la tecla espacio
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    sonidoSalto.Play();
                    auto.keyPressed(e);
                }

            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setFocusable(true);

    }
}
