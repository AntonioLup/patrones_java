package builder;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new CocheBuilder("toyota")
                .setPuertas(5)
                .setMotor("v5")
                .setTipo("electrico")
                .build();
        System.out.println(coche.getMarca());
        System.out.println(coche.getMotor());
        System.out.println(coche.getPuertas());
        System.out.println(coche.getTipo());
    }
}
