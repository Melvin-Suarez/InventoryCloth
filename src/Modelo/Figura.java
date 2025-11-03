package Modelo;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Figura extends JPanel {
    private BufferedImage imagenOriginal;
    private Color colorRelleno = new Color(135, 206, 250);
    private Image imagenColoreada;
    private String ruta = "/Recursos/Icono1.png";

    public Figura() {
        cargarImagen();
    }

    private void cargarImagen() {
        try {
            // Carga tu imagen PNG desde resources
            imagenOriginal = ImageIO.read(getClass().getResource(ruta));
            aplicarColor();
        } catch (IOException e) {
            e.printStackTrace();
            // Crear imagen temporal si hay error
            crearImagenTemporal();
        }
    }

    private void crearImagenTemporal() {
        int size = 300;
        imagenOriginal = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagenOriginal.createGraphics();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(new Color(0, 0, 0, 0));
        g2d.fillRect(0, 0, size, size);
        
        Shape forma = crearFormaOrganica(size, size);
        g2d.setColor(Color.WHITE);
        g2d.fill(forma);
        
        g2d.dispose();
    }

    private void aplicarColor() {
        if (imagenOriginal == null) return;
        
        int width = imagenOriginal.getWidth();
        int height = imagenOriginal.getHeight();
        
        imagenColoreada = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = ((BufferedImage)imagenColoreada).createGraphics();
        g2d.drawImage(imagenOriginal, 0, 0, null);
        
        // Aplicar color a las áreas que no son totalmente transparentes
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int argb = imagenOriginal.getRGB(x, y);
                int alpha = (argb >>> 24) & 0xFF;
                
                if (alpha > 10) { // Si no es totalmente transparente
                    // Crear nuevo color manteniendo la transparencia
                    int nuevoRGB = (alpha << 24) | 
                                  (colorRelleno.getRed() << 16) | 
                                  (colorRelleno.getGreen() << 8) | 
                                  colorRelleno.getBlue();
                    ((BufferedImage)imagenColoreada).setRGB(x, y, nuevoRGB);
                }
            }
        }
        
        g2d.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (imagenColoreada != null) {
            // Escalar la imagen al tamaño del panel
            Image escalada = imagenColoreada.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
            g2d.drawImage(escalada, 0, 0, null);
        }
    }

    public void setColorRelleno(Color color) {
        this.colorRelleno = color;
        aplicarColor();
        repaint();
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
        cargarImagen();
    }
    
    

    private Shape crearFormaOrganica(int width, int height) {
        GeneralPath path = new GeneralPath();
        int centroX = width / 2;
        int centroY = height / 2;
        int radioBase = Math.min(width, height) / 3;
        
        path.moveTo(centroX + radioBase * Math.cos(0), centroY + radioBase * Math.sin(0));
        
        for (int i = 1; i <= 360; i += 10) {
            double angulo = Math.toRadians(i);
            double radioVariado = radioBase * (0.8 + 0.2 * Math.sin(angulo * 3));
            double x = centroX + radioVariado * Math.cos(angulo);
            double y = centroY + radioVariado * Math.sin(angulo);
            path.lineTo(x, y);
        }
        
        path.closePath();
        return path;
    }
}