package co.jmurillo.proyecto_catalogo_poo.models;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }


    @Override
    public double getPrecioVenta() {
        // Aplicamos un 20% de impuesto al precio base
        return precio * 1.2;
    }
}
