/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

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

}
