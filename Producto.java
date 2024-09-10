/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author juanc
 */
public class Producto {
    private String nombre;
    private double precio; 
    private int cantidad; 

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    } 

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setprecio(double precio) {
        if (precio <= 0){
            System.out.println("El precio no puede ser cero o negativo");
        } else {
            this.precio = precio;
        }
    }

    public void setcantidad(int cantidad) {
        if (cantidad < 0){
            System.out.println("La cantidad no puede ser negativa");
        } else {
            this.cantidad = cantidad;
        }
        
    }

}
