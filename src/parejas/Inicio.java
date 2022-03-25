package parejas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame{

    private JPanel panelinicio;
    private JLabel titulo;
    private JButton button1;
    static Inicio inicio = new Inicio(); //creo una ventana de inicio static para poder acceder a ella cuando pulse el botón de ir a otra ventana
    static Parejas juego = new Parejas();

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    inicio.setVisible(true);
                    inicio.setSize(1250, 950);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Inicio() {

        setContentPane(panelinicio);
        button1.addActionListener(new nuevaPartida());
    }

    class nuevaPartida implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            juego.setVisible(true);
            juego.setSize(1250, 950);

            inicio.setVisible(false); //cerramos la ventana de inicio
        }
    }

}


