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
    private String modelo,matricula,tipo;
    private Date fecha;
    private double altura;
    private boolean peligrosa;

    public Vehiculo(String modelo, String matricula, String tipo, Date fecha) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Vehiculo(String modelo, String matricula, String tipo, Date fecha, double altura, boolean peligrosa) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.tipo = tipo;
        this.fecha = fecha;
        this.altura = altura;
        this.peligrosa = peligrosa;
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

    public double getAltura() {
        return altura;
    }

    public boolean isPeligrosa() {
        return peligrosa;
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

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeligrosa(boolean peligrosa) {
        this.peligrosa = peligrosa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", matricula=" + matricula + ", tipo=" + tipo + ", fecha=" + fecha + ", altura=" + altura + ", peligrosa=" + peligrosa + '}';
    }
}
