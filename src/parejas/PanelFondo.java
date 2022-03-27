package parejas;

import javax.swing.*;
import java.awt.*;

public class PanelFondo extends JPanel {

    private Image imagen;
    private ImageIcon fondo;

    //Esta clase es para poner una imagen como background en un JPanel.
    // Como la vamos a reutilizar, le pasamos por parámetro el icon

    public PanelFondo(ImageIcon fondo){
        this.fondo = fondo;
    }

    public void paint(Graphics g) {
        imagen = fondo.getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}

