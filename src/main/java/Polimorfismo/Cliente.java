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
public class Cliente {
    public static void main(String[] args) {
        Gatos objetoGato = new Gatos("Felina","carnivora",4,"pelo");
        Perros perro = new Perros("Pug", "carnivoro", 4,"pelo");
        perro.caminar(25);
        objetoGato.caminar(35);
    }
    
}
