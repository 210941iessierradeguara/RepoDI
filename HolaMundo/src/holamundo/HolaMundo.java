/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Date;

/**
 *
 * @author DAM2Alu5
 */
public class HolaMundo {
    static Nombre nombre = new Nombre();
    static Date fecha = new Date();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nombre.setNombre("Pepe");
        System.out.println("Saludando a " + nombre.getNombre());
    }
    
}
