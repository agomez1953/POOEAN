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
public abstract class Animal {
private String especie;
private String alimentacion;
private int cantidadExtremidades;
private String tipoPiel;

    public Animal(String especie, String alimentacion, int cantidadExtremidades, String tipoPiel) {
        this.especie = especie;
        this.alimentacion = alimentacion;
        this.cantidadExtremidades = cantidadExtremidades;
        this.tipoPiel = tipoPiel;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getCantidadExtremidades() {
        return cantidadExtremidades;
    }

    public void setCantidadExtremidades(int cantidadExtremidades) {
        this.cantidadExtremidades = cantidadExtremidades;
    }

   
    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }
    //Metodo abstracto -> metodo que solo se coloca la estructura y se termina de construir en las clases hijas
    public abstract void caminar(int entradaCantidadPasos);
        
    

}
