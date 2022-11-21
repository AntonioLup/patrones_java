package Factory;


public class Main {
    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("españa");
        System.out.println( precio.getPrecio());
    }
}