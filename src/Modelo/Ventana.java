package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;

public class Ventana extends JPanel {
    private Color centerColor = new Color(179, 0, 255); // Color central
    private Color outerColor = new Color(33, 0, 110); // Color exterior
    private Point gradientCenter = null; // null = centro automático
    private boolean autoResize = true; // Si se redibuja automáticamente al redimensionar

    public Ventana() {
        initComponents();
    }

    private void initComponents() {
        setOpaque(false); // Importante para que sea transparente
        
        // Listener para redibujar cuando se redimensiona
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if (autoResize) {
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int width = getWidth();
        int height = getHeight();
        
        if (width <= 0 || height <= 0) return;
        
        // Determinar el centro del degradado
        Point center;
        if (gradientCenter != null) {
            center = gradientCenter;
        } else {
            center = new Point(width / 2, height / 2);
        }
        
        // Calcular radio para cubrir toda el área
        float radius = (float) Math.sqrt(width * width + height * height) / 2;
        
        // Crear degradado radial
        float[] fractions = {0.0f, 1.0f};
        Color[] colors = {centerColor, outerColor};
        
        RadialGradientPaint gradient = new RadialGradientPaint(
            center, radius, fractions, colors
        );
        
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
    }

    // Métodos para modificar los colores
    public void setCenterColor(Color color) {
        this.centerColor = color;
        repaint();
    }

    public void setOuterColor(Color color) {
        this.outerColor = color;
        repaint();
    }

    public void setColors(Color center, Color outer) {
        this.centerColor = center;
        this.outerColor = outer;
        repaint();
    }

    // Métodos para controlar el centro del degradado
    public void setGradientCenter(Point center) {
        this.gradientCenter = center;
        repaint();
    }

    public void setGradientCenter(int x, int y) {
        setGradientCenter(new Point(x, y));
    }

    public void setAutoCenter() {
        this.gradientCenter = null;
        repaint();
    }

    // Controlar redibujo automático
    public void setAutoResize(boolean autoResize) {
        this.autoResize = autoResize;
    }

    // Getters
    public Color getCenterColor() {
        return centerColor;
    }

    public Color getOuterColor() {
        return outerColor;
    }

    public Point getGradientCenter() {
        return gradientCenter;
    }

    public boolean isAutoResize() {
        return autoResize;
    }

    // Método estático para crear un GradientPanel rápidamente
    public static Ventana create(Color centerColor, Color outerColor) {
        Ventana panel = new Ventana();
        panel.setCenterColor(centerColor);
        panel.setOuterColor(outerColor);
        return panel;
    }
}