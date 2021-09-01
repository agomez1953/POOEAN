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
public class Moto {

    String marca;
    int modelo;
    double cilindraje;
    String color;

    public Moto(String marca, int modelo, double cilindraje, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    public boolean encender(boolean apagado) {
        if (apagado == true) {
            System.out.println("la moto esta apagado");
            return true;
        } else {
            System.out.println("la moto esta prendido");
            return false;
        }
    }

    public boolean frenar(int velInicial, int velFinal) {
        if (velInicial >= velFinal) {
            System.out.println("frenando la moto");
            return true;
        } else {
            return false;
        }
    }

    public double acelerar(int velInicial, int velFinal) {
        int acelerador = 0;
        int aceleracion = (velFinal + velInicial);
        for (int i = 0; i <= 6; i++) { 
            aceleracion += 10;
            System.out.println(aceleracion);
        }
        return aceleracion;
    }

    public boolean encenderLuces(boolean prender) {
        if (prender == false) {
            System.out.println("Las luces estan apagadas");
            return false;
        } else {
            System.out.println("Las luces estan encendidas");
            return true;
        }
    }

}
