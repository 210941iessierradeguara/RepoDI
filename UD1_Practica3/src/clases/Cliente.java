/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author DAM2Alu5
 */
public class Cliente {
    private String name;
    private String apellidos;
    private String telefono;

    public Cliente(String name, String apellidos, String telefono) {
        this.name = name;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre: " + name + ", apellidos: " + apellidos + ", teléfono: " + telefono + '}';
    }
}
