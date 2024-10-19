package co.jmurillo.proyecto_catalogo_poo.models;

import co.jmurillo.proyecto_catalogo_poo.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {
    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
