/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DAM2Alu5
 */
public class Reparacion {
    private int codRep, horas, codMeca, CantPiezas;
    private String matriculaVehi, telfProp, piezasStr;
    private boolean terminada;
    private Double precioReparacion;
    private Date entrada, salida;


    public Reparacion(int codRep, int horas, int codMeca, int CantPiezas, 
            String matriculaVehi, String telfProp, boolean terminada, 
            Double precioReparacion) {
        this.codRep = codRep;
        this.horas = horas;
        this.codMeca = codMeca;
        this.CantPiezas = CantPiezas;
        this.matriculaVehi = matriculaVehi;
        this.telfProp = telfProp;
        this.terminada = terminada;
        this.precioReparacion = precioReparacion;
    }

    public Reparacion(int codRep, int horas, int codMeca, int CantPiezas, 
            String matriculaVehi, String telfProp, String piezasStr, 
            boolean terminada, Double precioReparacion) {
        this.codRep = codRep;
        this.horas = horas;
        this.codMeca = codMeca;
        this.CantPiezas = CantPiezas;
        this.matriculaVehi = matriculaVehi;
        this.telfProp = telfProp;
        this.piezasStr = piezasStr;
        this.terminada = terminada;
        this.precioReparacion = precioReparacion;
    }
    

    public int getCodRep() {
        return codRep;
    }

    public int getHoras() {
        return horas;
    }

    public int getCodMeca() {
        return codMeca;
    }

    public int getCantPiezas() {
        return CantPiezas;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public Double getPrecioReparacion() {
        return precioReparacion;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSalida() {
        return salida;
    }


    public void setCodRep(int codRep) {
        this.codRep = codRep;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCodMeca(int codMeca) {
        this.codMeca = codMeca;
    }

    public void setCantPiezas(int CantPiezas) {
        this.CantPiezas = CantPiezas;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    public void setPrecioReparacion(Double precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }


    public String getMatriculaVehi() {
        return matriculaVehi;
    }

    public String getTelfProp() {
        return telfProp;
    }

    public void setMatriculaVehi(String matriculaVehi) {
        this.matriculaVehi = matriculaVehi;
    }

    public void setTelfProp(String telfProp) {
        this.telfProp = telfProp;
    }

    public String getPiezasStr() {
        return piezasStr;
    }

    public void setPiezasStr(String piezasStr) {
        this.piezasStr = piezasStr;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "codRep=" + codRep + ", horas=" + horas + ", codMeca=" + codMeca + ", CantPiezas=" + CantPiezas + ", matriculaVehi=" + matriculaVehi + ", telfProp=" + telfProp + ", piezasStr=" + piezasStr + ", terminada=" + terminada + ", precioReparacion=" + precioReparacion + ", entrada=" + entrada + ", salida=" + salida + '}';
    }
}
