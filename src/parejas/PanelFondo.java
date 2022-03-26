package parejas;

import javax.swing.*;
import java.awt.*;

public class PanelFondo extends JPanel {

    private Image imagen;
    private ImageIcon fondo;

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

