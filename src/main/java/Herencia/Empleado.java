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
public class Empleado extends Persona {

    private String NombreEmpresa;
    private String dependencia;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, String genero, String NombreEmpresa, String dependencia, double sueldo) {
        super(nombre, apellido, edad, genero);
        this.NombreEmpresa = NombreEmpresa;
        this.dependencia = dependencia;
        this.sueldo = sueldo;
    }

}
