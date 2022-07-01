package Poligono.models;

import javax.swing.*;

public class Impresion {
    public void impresion(Punto[] puntos){
        JOptionPane.showMessageDialog(null, "El punto " + "queda en: " + puntos[0].getX()+
                "\nEl punto " +(2)+ "queda en: " + puntos[1].getX()+ ", "+ puntos[1].getY() +
                "\nEl punto" +(3)+ "queda en: " + puntos[2].getX()+ ", "+ puntos[2].getY() +
                "\nEl punto" +(4)+ "queda en: " + puntos[3].getY()+ ", "+ puntos[3].getY());
    }
}
