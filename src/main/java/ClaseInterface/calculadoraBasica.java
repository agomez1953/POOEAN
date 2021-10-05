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
public class calculadoraBasica implements CalculosAritmeticos {

    @Override
    public double suma(double numero1, double numero2) {
      return numero1+numero2;
    }

    @Override
    public double Multiplicacion(double numero1, double numero2) {
        return numero1*numero2;
    }


}
