package co.jmurillo.proyecto_catalogo_poo.models;

public class Iphone extends Electronico{
    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }


    @Override
    public double getPrecioVenta() {
        // Aplicamos un 10% de impuesto al precio base
        return precio * 1.1;
    }
}
