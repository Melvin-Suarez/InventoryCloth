
package model;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class spinnerRedondeado extends JSpinner {
    private int cornerRadius = 50;
    private Color backgroundColor = Color.WHITE;
    private Color borderColor = Color.GRAY;

    public spinnerRedondeado() {
        super();
        personalizarSpinner();
    }

    public spinnerRedondeado(SpinnerModel model) {
        super(model);
        personalizarSpinner();
    }

    public spinnerRedondeado(int cornerRadius, Color backgroundColor) {
        super();
        this.cornerRadius = cornerRadius;
        this.backgroundColor = backgroundColor;
        personalizarSpinner();
    }

    private void personalizarSpinner() {
       // Hacer el spinner transparente para que se vea el fondo redondeado
        setOpaque(false);
        
        // Personalizar el borde
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        // Personalizar el editor del spinner
        JFormattedTextField editor = ((JSpinner.DefaultEditor) getEditor()).getTextField();
        editor.setOpaque(false);
        editor.setBackground(new Color(0, 0, 0, 0)); // Transparente
        editor.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar fondo redondeado
        g2.setColor(backgroundColor);
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));

        // Dibujar borde redondeado
        g2.setColor(borderColor);
        g2.draw(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));

        g2.dispose();
        super.paintComponent(g);
    }

    // Métodos para personalizar
    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }

    public void setBackgroundColor(Color color) {
        this.backgroundColor = color;
        repaint();
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
        repaint();
    }
}
