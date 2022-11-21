package Prototype;

public class Coche implements Cloneable {
    public String marca;
    public String tipo;
    public String motor;
    public int puertas;

    public Coche() {}
    public Coche clonar() throws CloneNotSupportedException{
        return (Coche)this.clone();

    }
}
