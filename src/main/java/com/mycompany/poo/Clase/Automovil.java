/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.Clase;

/**
 *
 * @author Andres
 */
public class Automovil {

    String marca;
    int modelo;
    double cilindraje;
    String color;
    String tipo;
    String combustible;

    public boolean encender(boolean apagado) {
        if (apagado == true) {
            System.out.println("el vehiculo esta apagado");
            return true;
        } else {
            System.out.println("el vehiculo esta prendido");
            return false;
        }
    }

    public void acelerar(int velInicial, int velFinal) {
        while (velInicial <= velFinal) {
            velInicial += 10;
            System.out.println("El vehiculo esta acelerando a " + velInicial + "Km/h");
        }
    }

    public void girar(String tipoGiro) {
        if (tipoGiro.equals("Izquierda")) {
            System.out.println("girando a la izquierda");
        }
        if (tipoGiro.equals("derecha")) {
            System.out.println("girando a la derecha");
        }
    }

    public void frenar(int velInicial, int velFinal) {
        while (velInicial >= velFinal) {
            System.out.println("frenando...");
        }
    }

}
