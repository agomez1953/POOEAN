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
public class Perros extends Animal {

    public Perros(String especie, String alimentacion, int cantidadExtremidades, String tipoPiel) {
        super(especie, alimentacion, cantidadExtremidades, tipoPiel);
    }

    @Override
    public void caminar(int entradaCantidadPasos) {
       int contador = 0;
        while(contador<=entradaCantidadPasos){
            System.out.println("el perro esta caminando y va el el paso"+contador);
            contador+=1;
       }
    }
    public void ladrar(int entradaVecesLadridos){
        for (int i = 0; i <= entradaVecesLadridos; i++) {
            System.out.println("wof...wof");
        }
    }
    public void ladrar(String mensaje,int cantidadVecesLadrar){
        String salida=" ";
        for (int i = 0; i < cantidadVecesLadrar; i++) {
            
            salida = salida+mensaje+" ";
        }
        JOptionPane.showMessageDialog(null, "Ladro");
    }

}
