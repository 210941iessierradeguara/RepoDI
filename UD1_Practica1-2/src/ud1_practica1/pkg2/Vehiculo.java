/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1_practica1.pkg2;

import java.util.Date;

/**
 *
 * @author DAM2Alu5
 */
public class Vehiculo {
    private String modelo,matricula,tipo, nombre, apellidos, dni;
    private Date fecha;
    //private double altura;
    //private boolean peligrosa;


    public Vehiculo(String modelo, String matricula, String tipo, String nombre, String apellidos, String dni, Date fecha) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fecha = fecha;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", matricula=" + matricula + ", tipo=" + tipo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fecha=" + fecha + '}';
    }
}
