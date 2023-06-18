
package Ventas_test;

import sistemaventas.*;
public class Consulta {
    
    public static void main(String[] args) {
            
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Pantalon", 100.00);
        Producto producto4 = new Producto("Pantalon", 100.00);
        Producto producto5 = new Producto("Pantalon", 100.00);
        Producto producto6 = new Producto("Pantalon", 100.00);
        Producto producto7 = new Producto("Pantalon", 100.00);
        Producto producto8 = new Producto("Pantalon", 100.00);
        Producto producto9 = new Producto("Pantalon", 100.00);
        Producto producto10 = new Producto("tete", 100.00);
        
        //Excede
        Producto producto11 = new Producto("lolo", 100.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        
        //Excede
        orden1.agregarProducto(producto11);
        orden1.mostrarOrden();
        
    }
       
}
