package adapted;

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapted bombilla = new PowerAdapted();
        enciende(horno);
//        enciende(lampara);
        enciende(bombilla);
        System.out.println(estaEnciende(horno));
        System.out.println(estaEnciende(lampara));
        System.out.println(estaEnciende(bombilla));
    }
//    15:33 minuto
    public static void enciende(Enchufable enchufable){
        enchufable.enciende();
    }
    public static void apaga(Enchufable enchufable){
        enchufable.apaga();
    }
    public static boolean estaEnciende(Enchufable enchufable){
       return enchufable.estaEnciende();
    }
}
