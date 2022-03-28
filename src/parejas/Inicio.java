package parejas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Inicio extends JFrame{

    private JPanel panelinicio;
    private JLabel start;
    private JLabel salir;
    private JLabel mazo;
    private JLabel mazo2;

    static Inicio inicio = new Inicio(); //creo una ventana de inicio static para poder acceder a ella cuando pulse el botón de ir a otra ventana

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    inicio.setVisible(true);
                    inicio.setSize(1250, 950);
                    Parejas.reproducir(3);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Inicio() {

        //Creamos un JPanel personalizado para añadir una imagen como fondo (Intelliji no permite un layout absolute)
        PanelFondo fondoInicio = new PanelFondo(new ImageIcon(Parejas.class.getResource("/img/fondoGif.gif")));

        panelinicio.setSize(1250,950);
        panelinicio.setBounds(0, 0, 1250,950);
        fondoInicio.setSize(1250, 950);
        fondoInicio.setBounds(0,0,1250,950);

        fondoInicio.add(panelinicio); //A este panel personalizado le añadimos el que construimos en el .form

        setContentPane(fondoInicio);

        start.addMouseListener(new start());
        salir.addMouseListener(new salir());
    }

    public static void nuevaPartida(){

        Parejas.reproducir(0);
        Parejas partida = new Parejas();
        partida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        partida.setVisible(true);
        partida.setSize(1250, 950);
        inicio.setVisible(false); //cerramos la ventana de inicio
    }

    class start extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            nuevaPartida();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            mazo.setIcon(new ImageIcon(Parejas.class.getResource("/img/mazo.gif")));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            mazo.setIcon(new ImageIcon(Parejas.class.getResource("/img/blank.gif")));
        }
    }

    class salir extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.exit(0);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            mazo2.setIcon(new ImageIcon(Parejas.class.getResource("/img/mazo.gif")));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            mazo2.setIcon(new ImageIcon(Parejas.class.getResource("/img/blank.gif")));
        }
    }

}




