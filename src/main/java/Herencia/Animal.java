/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Andres
 */
public class Animal {
    private String tipoAnimal;
    private String raza;
    private String nombreCientifico;

    public Animal(String tipoAnimal, String raza, String nombreCientifico) {
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    
    
}
