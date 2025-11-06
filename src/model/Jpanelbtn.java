
package model;
import javax.swing.*;
import java.awt.*;

public class Jpanelbtn extends JPanel{
    private int radius;

    public Jpanelbtn() {
        this(40); // Radio por defecto (puedes ajustarlo)
    }

    public Jpanelbtn(int radius) {
        this.radius = radius;
        setOpaque(false); // Fondo transparente para el redondeo
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Padding interno
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        
        // Configuración para máxima calidad
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2.setRenderingHint(
            RenderingHints.KEY_RENDERING,
            RenderingHints.VALUE_RENDER_QUALITY
        );
        g2.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB
        );

        // Fondo redondeado
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Texto (pintado sobre el fondo)
        super.paintComponent(g2);
        g2.dispose();
    } 

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Borde suavizado
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(1.5f)); // Grosor del borde (ajustable)
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
        g2.dispose();
    }
}