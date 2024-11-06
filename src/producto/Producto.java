/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author LisyAndy
 */
public class Producto {


    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo. El precio no se modificará.");
        } else {
            this.precio = precio;
        }
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: La cantidad no puede ser negativa. La cantidad no se modificará.");
        } else {
            this.cantidad = cantidad;
        }
    }   
}
