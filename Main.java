/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author juanc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto("aceite", 1400.25, 2);
       
        System.out.println("Nombre: " + producto.getnombre());
        System.out.println("Precio: " + producto.getprecio());
        System.out.println("Cantidad: " + producto.getcantidad());
        
        
        producto.setprecio(-10);
        producto.setcantidad(10);
        
        System.out.println("Producto: " + producto.getnombre());
        System.out.println("Precio: " + producto.getprecio());
        System.out.println("Cantidad " + producto.getcantidad());
    }
    
}
