package adapted;

public class Bombilla {
    boolean powerON = false;
    int voltage = 0;

    public void turnON(int voltage){
        powerON =true;
        this.voltage = voltage;

    }
    public void turnOFF(){
        powerON =false;
        voltage = 0;
    }
    public boolean isPowerOn(){
        return powerON;
    }
}
