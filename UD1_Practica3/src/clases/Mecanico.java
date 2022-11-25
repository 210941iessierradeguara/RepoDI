/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author DAM2Alu5
 */
public class Mecanico {
    private int codigo;
    private String nombre, nombreUsr, passwd;

    public Mecanico(int codigo, String nombre, String nombreUsr, String Passwd) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreUsr = nombreUsr;
        this.passwd = Passwd;
    }
    
    public boolean PassCheck(String password)
    {
        return this.passwd.equals(password);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsr() {
        return nombreUsr;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
    }

    public void setPasswd(String Passwd) {
        this.passwd = Passwd;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "codigo=" + codigo + ", nombre=" + nombre + ", nombreUsr=" + nombreUsr + ", Passwd=" + passwd + '}';
    }
}
