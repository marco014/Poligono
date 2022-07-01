package Poligono.models;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class LecturaDatos {
    public void lectura(){
        Scanner teclado = new Scanner(System.in);
        Punto punto = new Punto(0,0);
        Operaciones proceso = new Operaciones();
        proceso.definirP();
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(null, "Menu\n" + "1. Trasladar\n" + "2. Escalar");
            opcion = Integer.parseInt(entrada);
            switch (opcion){
                case 1:
                    entrada = JOptionPane.showInputDialog(null, "Ingrese el valor de X: ");
                    punto.setX(Float.parseFloat(entrada));
                    entrada = JOptionPane.showInputDialog(null, "Ingrese el valor de Y: ");
                    punto.setY(Float.parseFloat(entrada));
                    proceso.trasladar(punto);
                    break;
                case 2:
                    entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de X:" );
                    punto.setX(Float.parseFloat(entrada));
                    entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de Y: ");
                    punto.setY(Float.parseFloat(entrada));
                    proceso.escalar(punto);
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Error, elija una opcion valida");
                    break;
            }
        } while (opcion != 1 && opcion != 2);
    }
}
