package adapted;

public class Horno implements Enchufable {
    boolean encendido = false;
    @Override
    public void enciende(){
        encendido = true;
    }
    @Override
    public void apaga(){
        encendido = false;
    }
    @Override
    public boolean estaEnciende(){
        return encendido;
    }

}
