
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Clientes {
    private List<Ventas> vendido;
    private String nombre;
    private LocalDateTime fecha;
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("'Este' EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm a");

    public Clientes() {
    }

    
    public Clientes(Ventas vendido, String nombre, LocalDateTime fecha) {
        this.vendido.add(vendido);
        this.nombre = nombre;
        this.fecha = fecha;
        this.fecha.format(formatoFecha);
    }

    public List<Ventas> getVendido() {
        return vendido;
    }

    public void setVendido(List<Ventas> vendido) {
        this.vendido = vendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha.format(formatoFecha);
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
        this.fecha.format(formatoFecha);
    }
    
    
    
}
