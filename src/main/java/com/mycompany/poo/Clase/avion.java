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
public class avion {

    private String fabricante;
    private double horasDeVuelo;
    private double cantidadCombustible;
    private int cantidadPasajeros;
    private int cantidadTurbinas;
    private String modelo;

    public avion(String fabricante, double horasDeVuelo, double cantidadCombustible, int cantidadPasajeros, int cantidadTurbinas, String modelo) {
        this.fabricante = fabricante;
        this.horasDeVuelo = horasDeVuelo;
        this.cantidadCombustible = cantidadCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadTurbinas = cantidadTurbinas;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public void setHorasDeVuelo(double horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadTurbinas() {
        return cantidadTurbinas;
    }

    public void setCantidadTurbinas(int cantidadTurbinas) {
        this.cantidadTurbinas = cantidadTurbinas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
