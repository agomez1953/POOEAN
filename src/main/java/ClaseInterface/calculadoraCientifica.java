/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseInterface;

/**
 *
 * @author Andres
 */
public class calculadoraCientifica implements calculoTrigonometrico,calculosGeometricos{

    @Override
    public double seno(double entradaAngulo) {
      return Math.sin(entradaAngulo);
    }

    @Override
    public double coseno(double entradaAngulo) {
        return Math.cos(entradaAngulo);
    }

    @Override
    public double areaCuadrado(double entradaLado) {
        return entradaLado*entradaLado;
    }

    @Override
    public double AreaCirculo(double entradaRadio) {
       return Math.pow(entradaRadio, 2);
    }
    
}
    