package adapted;

public class PowerAdapted implements Enchufable {
    public Bombilla bombilla = new Bombilla();
    @Override
    public void enciende() {
        bombilla.turnON(110);
    }

    @Override
    public void apaga() {
        bombilla.turnOFF();
    }

    @Override
    public boolean estaEnciende() {
        return bombilla.isPowerOn();
    }
}
