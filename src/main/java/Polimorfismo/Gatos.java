/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Gatos extends Animal {

    public Gatos(String especie, String alimentacion, int cantidadExtremidades, String tipoPiel) {
        super(especie, alimentacion, cantidadExtremidades, tipoPiel);
    }

    @Override
    public void caminar(int entradaCantidadPasos) {
        JOptionPane.showMessageDialog(null, "El gato camino"+entradaCantidadPasos);
    }

    

}
