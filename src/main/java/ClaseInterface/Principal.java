/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseInterface;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese 0 para area del circulo");
        System.out.println("Ingrese 1 para area del cuadrado");
        System.out.println("ingrese 2 para hallar seno");
        System.out.println("ingrese 3 para hallar coseno");
        System.out.println("ingrese 4 para hallar una multiplicacion");
        System.out.println("ingrese 5 para halla una suma");
        int numero = sc.nextInt();
        menu(numero);
    }

    public static void menu(int selector) {

        calculadoraBasica basica = new calculadoraBasica();
        calculadoraCientifica cientifica = new calculadoraCientifica();
        switch (selector) {
            case 0:
                System.out.println("Ingrese el dato");
                double dato = sc.nextDouble();
                System.out.println("El area del circulo es " + cientifica.AreaCirculo(dato));
                break;
            case 1:
                System.out.println("Ingrese el dato");
                double dato2 = sc.nextDouble();
                System.out.println("El area del cuadrado es" + cientifica.areaCuadrado(dato2));
                break;
            case 2:
                System.out.println("Ingrese el dato");
                double dato3 = sc.nextDouble();
                System.out.println("El seno es" + cientifica.seno(dato3));
                break;
            case 3:
                System.out.println("Ingrese el dato");
                double dato4 = sc.nextDouble();
                System.out.println("El coseno es " + cientifica.coseno(dato4));
                break;
            case 4:
                System.out.println("Ingrese el primer dato");
                double dato5 = sc.nextDouble();
                System.out.println("Ingrese el segundo dato");
                double dato6 = sc.nextDouble();
                System.out.println("La multiplicacion es" + basica.Multiplicacion(dato5, dato6));
                break;
            case 5:
                System.out.println("Ingrese el primer dato");
                double dato7 = sc.nextDouble();
                System.out.println("Ingrese el segundo dato");
                double dato8 = sc.nextDouble();
                System.out.println("La suma es " + basica.suma(dato7, dato8));
                break;
        }
    }
}
