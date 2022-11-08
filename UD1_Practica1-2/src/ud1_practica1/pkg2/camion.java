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
public class Camion extends Vehiculo {
    private Double altura;
    private boolean mPeligrosa;
    
    public Camion(Double altura, boolean mPeligrosa, String modelo, String matricula, String tipo, String nombre, String apellidos, String dni, Date fecha) {
        super(modelo, matricula, tipo, nombre, apellidos, dni, fecha);
        this.altura = altura;
        this.mPeligrosa = mPeligrosa;
    }

    public Double getAltura() {
        return altura;
    }

    public boolean ismPeligrosa() {
        return mPeligrosa;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setmPeligrosa(boolean mPeligrosa) {
        this.mPeligrosa = mPeligrosa;
    }

    @Override
    public String toString() {
        return "camion{" + "altura=" + altura + ", mPeligrosa=" + mPeligrosa + '}';
    }
}
