package Prototype;


public class Main {
    public static void main(String[] args) {
        Coche coche =  new Coche();
        coche.puertas= 5;
        coche.tipo= "diesel";
        coche.marca= "toyota";
        coche.motor= "v5";
        System.out.println(coche.puertas);
        try{
            Coche clonado = coche.clonar();
            System.out.println(clonado.motor);
        }catch (CloneNotSupportedException e){
            System.out.println("NO" + e.getMessage());
        }
    }
}
