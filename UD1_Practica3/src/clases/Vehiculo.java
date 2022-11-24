/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Objeto vehículo con matrícula, modelo, marca y telfPropietario.
 * 
 * @author DAM2Alu5
 */
public class Vehiculo {
    private String matricula, modelo, marca, telfPropietario;

    public Vehiculo(String matrícula, String modelo, String marca, String telfPropietario) {
        this.matricula = matrícula;
        this.modelo = modelo;
        this.marca = marca;
        this.telfPropietario = telfPropietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTelfPropietario() {
        return telfPropietario;
    }

    public void setMatricula(String matrícula) {
        this.matricula = matrícula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTelfPropietario(String telfPropietario) {
        this.telfPropietario = telfPropietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matr\u00edcula: " + matricula + ", modelo: " 
                + modelo + ", marca: " + marca + ", Teléfono del propietario: " 
                + telfPropietario + '}';
    }
}
