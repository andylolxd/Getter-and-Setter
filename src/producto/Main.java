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
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Mouse", 2000.00, 10);
        
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        
        producto.setNombre("Mouse RGB");
        producto.setPrecio(3500.00);
        producto.setCantidad(8);
        
        System.out.println("\nValores modificados:");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        
        System.out.println("\nIntentando establecer valores inválidos:");
        producto.setPrecio(-100.00); 
        producto.setCantidad(-5);    

        System.out.println("\nValores después de intentos inválidos:");
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
    }
}
