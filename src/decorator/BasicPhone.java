package decorator;

public class BasicPhone implements Phone {
    @Override
    public void make() {
        System.out.println("im a phone and i have this features: ");
        this.haveGSM();
        this.haveSMS();
    }
    private void haveGSM(){
        System.out.println(" basico: -> GSM");
    }private void haveSMS(){
        System.out.println(" basico: -> SMS");
    }
}
