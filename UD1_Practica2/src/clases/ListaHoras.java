/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author DAM2Alu5
 */
public class ListaHoras {
    private ArrayList<Hora> lista;

    public ListaHoras() {
        lista = new ArrayList<Hora>();
    }

    public void setHora(Hora h) {
        lista.add(h);
    }

    public Hora getHora(int h) {
        return lista.get(h);

    }
    public int tamanyo(){
        return lista.size();
    }
    public void imprime() {
        for (Hora h : lista) {
            System.out.println(h.toString());
        }
    }

}
