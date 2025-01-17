package co.jmurillo.proyecto_catalogo_poo.models;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        // Aplicamos un 8% de impuesto al precio base
        return precio * 1.08;
    }
}
