package co.jmurillo.proyecto_catalogo_poo.models;

import co.jmurillo.proyecto_catalogo_poo.interfaces.IProducto;

abstract public class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    // Nota: getPrecioVenta() no se implementa aquí porque puede variar entre subclases
}
