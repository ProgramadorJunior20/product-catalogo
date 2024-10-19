package co.jmurillo.proyecto_catalogo_poo;

import co.jmurillo.proyecto_catalogo_poo.interfaces.*;
import co.jmurillo.proyecto_catalogo_poo.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        List<IProducto> catalogo = new ArrayList<>();

        // Crear instancias de productos
        IProducto iphone = new Iphone(999, "Apple", "Iphone 16", "Titanio Desertico");
        IProducto tv = new TvLcd(499, "Samsung", 55);
        IProducto libro = new Libro(29, new Date(), "George Orwell", "1984", "Penguin Books");
        IProducto comic = new Comics(12, new Date(), "Alan Moore", "Watchmen", "DC Comics", "Dr. Manhattan");

        // Añadir productos al catálogo
        catalogo.add(iphone);
        catalogo.add(tv);
        catalogo.add(libro);
        catalogo.add(comic);

        // Mostrar información de los productos
        for (IProducto producto: catalogo){
            System.out.println("Producto: " + producto.getClass().getSimpleName());
            System.out.println("Precio Base: $" + producto.getPrecio());
            System.out.println("Precio de Venta: $" + producto.getPrecioVenta());

            // Mostrar información específica según el tipo de producto
            if (producto instanceof IElectronico) {
                System.out.println("Fabricante: " + ((IElectronico) producto).getFabricante());
            }
            if (producto instanceof ILibro){
                ILibro libroProducto = (ILibro) producto;
                System.out.println("Titulo: " + libroProducto.getTitulo());
                System.out.println("Autor: " + libroProducto.getAutor());
            }
            if (producto instanceof Comics){
                System.out.println("Personaje Principal: " + ((Comics) producto).getPersonaje());
            }

            System.out.println("--------------------");
        }

    }
}
