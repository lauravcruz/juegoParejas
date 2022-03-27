package parejas;

import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static parejas.Inicio.*;

public class Parejas extends JFrame {

    private JPanel panel;
    private JLabel intentos;
    private JLabel f1c1;
    private JLabel f1c2;
    private JLabel f1c3;
    private JLabel f1c4;
    private JLabel f2c1;
    private JLabel f2c2;
    private JLabel f2c3;
    private JLabel f2c4;
    private JLabel f3c1;
    private JLabel f3c2;
    private JLabel f3c3;
    private JLabel f3c4;
    private JLabel f4c1;
    private JLabel f4c2;
    private JLabel f4c3;
    private JLabel f4c4;
    private JLabel salir;

    private LinkedList<ImageIcon> icons = new LinkedList<>();
    private HashMap<Integer, ImageIcon> relacion_carta = new HashMap<>();
    private ArrayList<JLabel> pareja = new ArrayList();
    private int n = 0;
    private JLabel intentoText;
    private int ganar = 8;

    public Parejas() {

        PanelFondo panelfondo = new PanelFondo(new ImageIcon(getClass().getResource("/img/fondo.png")));
        panelfondo.setSize(1250, 950);
        panelfondo.setBounds(0, 0, 1250, 950);
        panelfondo.setLayout(new CardLayout());
        panelfondo.add(panel, 0);
        setContentPane(panelfondo);

        Border border = BorderFactory.createLineBorder(Color.YELLOW, 5);
        intentos.setBorder(border);

        intentoText = intentos;

        //Añadimos los icons duplicados a un Linkedlist
        icons.add(new ImageIcon(Parejas.class.getResource("/img/cruzazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/cruzazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/cuadradoazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/cuadradoazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/hazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/hazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/hexacirculoazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/hexacirculoazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/hexacuadradoazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/hexacuadradoazul.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/inca.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/inca.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/lazos2rojo.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/lazos2rojo.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/lazos3verde.png")));
        icons.add(new ImageIcon(Parejas.class.getResource("/img/lazos3verde.png")));

        Collections.shuffle(icons); //Los desordenamos

        //Asociamos cada ImageIcon a un número
        relacion_carta.put(0, icons.get(0));
        relacion_carta.put(1, icons.get(1));
        relacion_carta.put(2, icons.get(2));
        relacion_carta.put(3, icons.get(3));
        relacion_carta.put(4, icons.get(4));
        relacion_carta.put(5, icons.get(5));
        relacion_carta.put(6, icons.get(6));
        relacion_carta.put(7, icons.get(7));
        relacion_carta.put(8, icons.get(8));
        relacion_carta.put(9, icons.get(9));
        relacion_carta.put(10, icons.get(10));
        relacion_carta.put(11, icons.get(11));
        relacion_carta.put(12, icons.get(12));
        relacion_carta.put(13, icons.get(13));
        relacion_carta.put(14, icons.get(14));
        relacion_carta.put(15, icons.get(15));

        //Asociamos un evento de click a cada Jlabel
        f1c1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f1c1, 0);
            }
        });

        f1c2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f1c2, 1);
            }
        });

        f1c3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f1c3, 2);
            }
        });

        f1c4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f1c4, 3);
            }
        });

        f2c1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f2c1, 4);
            }
        });

        f2c2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f2c2, 5);

            }
        });

        f2c3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f2c3, 6);
            }
        });

        f2c4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f2c4, 7);
            }
        });

        f3c1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f3c1, 8);
            }
        });

        f3c2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f3c2, 9);
            }
        });

        f3c3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f3c3, 10);
            }
        });

        f3c4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f3c4, 11);

            }
        });

        f4c1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f4c1, 12);

            }
        });

        f4c2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f4c2, 13);
            }
        });

        f4c3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f4c3, 14);
            }
        });

        f4c4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                revelarCarta(f4c4, 15);
            }
        });
        salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                reproducir(0);
                inicio.setVisible(true);
                dispose(); //cierra la actual ventana
            }
        });
    }

    public void revelarCarta(JLabel carta, Integer i) {

        if (pareja.size() == 2) { //Si ya se han seleccionado dos cartas, llamamos a comparar
            comparar();
        }

        if (!pareja.contains(carta)) { //Este if controla que no se pulse dos veces sobre la misma carta
            carta.setIcon(relacion_carta.get(i)); //Le seteamos el icono asociado en el HashMap con un entero
            pareja.add(carta); //Lo añadimos al array en el que guardamos las 2 cartas seleccionadas del turno
        }
    }

    public void comparar() {

        n++; //Sumamos el intento CUANDO SE COMPARAN, y lo seteamos en la etiqueta de los intentos
        intentoText.setText(":" + n);

        //Si el icono de las dos parejas es igual, las volvemos invisibles. Si no, se le setea el icon del reverso de la carta
        if (pareja.get(0).getIcon().toString().equals(pareja.get(1).getIcon().toString())) {
            reproducir(1);
            pareja.get(0).setVisible(false);
            pareja.get(1).setVisible(false);
            ganar++; //esta variable cuenta el número de aciertos

        } else {
            reproducir(2);
            pareja.get(0).setIcon(new ImageIcon(Parejas.class.getResource("/img/atras.png")));
            pareja.get(1).setIcon(new ImageIcon(Parejas.class.getResource("/img/atras.png")));
        }

        if (ganar == 8) { //cuando acierte las 8 parejas, se acaba el juego

            UIManager ui = new UIManager(); //esto personaliza la ventana emergente del mensaje

            ui.put("OptionPane.background", new Color(185, 33, 33));
            ui.put("Panel.background", new Color(185, 33, 33));
            ui.put("OptionPane.messageFont", new FontUIResource(new Font("Dubai", Font.TYPE1_FONT, 18)));
            ui.put("OptionPane.messageForeground", new Color(254,236,0));

            int resultado = JOptionPane.showConfirmDialog (null, "ENHORABUENA, HAS GANADO EN " + n
                    + " INTENTOS " + "\n" + "¿Quieres jugar otra vez?","¡VICTORIA!", JOptionPane.YES_NO_OPTION);

            if(resultado == JOptionPane.YES_OPTION) {
                dispose();
                Inicio.nuevaPartida();
            }else {
                System.exit(0);
            }
        }
            pareja.clear(); //Vaciamos el array de las parejas de ese turno
        }

    public static void reproducir(int tipoSonido) {

        BufferedInputStream bis;
        AudioInputStream ais;

        if (tipoSonido == 0){ //Según el parámetro introducido, vamos a reproducir x efecto:
             bis = new BufferedInputStream(Parejas.class.getResourceAsStream("/sound/click.wav"));
        }else if (tipoSonido == 1){
             bis = new BufferedInputStream(Parejas.class.getResourceAsStream("/sound/acierto.wav"));
        }else if (tipoSonido == 2){
            bis = new BufferedInputStream(Parejas.class.getResourceAsStream("/sound/error.wav"));
        }else {
            bis = new BufferedInputStream(Parejas.class.getResourceAsStream("/sound/jungle.wav"));
        }

        try {
            ais = AudioSystem.getAudioInputStream(bis);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            if (tipoSonido == 3){ //Si estamos controlando la canción, reproducir en bucle
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    }







