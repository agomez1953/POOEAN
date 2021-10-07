package arrList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import arrList.persona;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class arraylist {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //declaramos arraylist
        ArrayList<persona> arregloPersona = new ArrayList<persona>();
        persona objeto1 = new persona(123, "condorito", "Peladez", 47);
        persona objeto2 = new persona(321, "Andres", "Gomez", 21);
        //agragamos al arreglo los objetos//
        arregloPersona.add(objeto1);
        arregloPersona.add(objeto2);
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id"));
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
        //creamos nuevo objeto
        persona objeto3 = new persona(id, nombre, apellido, edad);
        //agregamos el objeto 3
        arregloPersona.add(objeto3);
        //añadiremos un nuevo usuario por consola
        int r = 1;
        while (r == 1) {
            System.out.println("Ingrese 1 si quiere añadir un nuevo usuario, por el contrario ingrese 2");
            int y = sc.nextInt();
            if (y == 1) {
                int idp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id"));
                String nombrep = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                String apellidop = JOptionPane.showInputDialog(null, "Ingrese el apellido");
                int edadp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                persona objetox = new persona(idp, nombrep, apellidop, edadp);
                arregloPersona.add(objetox);
            }else{
                break;
            }

            //recorrer el arreglo
            for (int i = 0; i < arregloPersona.size(); i++) {
                System.out.println("Nombre " + arregloPersona.get(i).getNombre());
                System.out.println("Apellido " + arregloPersona.get(i).getApellido());
                System.out.println("Edad " + arregloPersona.get(i).getEdad());
                System.out.println("id " + arregloPersona.get(i).getId());
            }
        }
    }
}
