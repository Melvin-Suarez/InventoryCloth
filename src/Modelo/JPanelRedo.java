package Modelo;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class JPanelRedo extends JPanel{
    private final double ancho = 40;
    private final double alto = 40;
    private final Color Claro = new Color(31, 119, 251);
    private final Color Oscuro = new Color(6, 11, 71);

    public JPanelRedo() {
        this.setOpaque(false);
    }
    
    
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D G =(Graphics2D)g.create();
        
        G.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        GradientPaint gradient = new  GradientPaint(0,0, Claro, 0, getHeight(), Oscuro);
        
        RoundRectangle2D.Double Rectangulo = new RoundRectangle2D.Double(0,0,this.getWidth()-1,this.getHeight()-1,ancho,alto);
        
        G.setPaint(gradient);
        G.fill(Rectangulo);
        
        G.setColor(this.getBackground());
        G.draw(Rectangulo);
        G.dispose();
        
        super.paintComponent(g);
    }
    
            
}