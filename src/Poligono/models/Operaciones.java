package Poligono.models;

public class Operaciones {
    private Punto[] punto = new Punto[4];
    Impresion impresion = new Impresion();
    public void definirP(){
        punto[0] = new Punto(0, 0);
        punto[1] = new Punto(2, 0);
        punto[2] = new Punto(2, 2);
        punto[3] = new Punto(0, 2);
    }
    public void trasladar(Punto punto1){
        for (int i=0; i<4; i++){
            punto[i].setX(punto[i].getX()+punto1.getX());
            punto[i].setY(punto[i].getY()+ punto1.getY());
        }
        impresion.impresion(punto);
    }
    public void escalar(Punto punto1){
        for (int i=0; i<4; i++){
            punto[i].setX(punto[i].getX()* punto1.getY());
            punto[i].setX(punto[i].getY()* punto1.getY());
        }
        impresion.impresion(punto);
    }
}
