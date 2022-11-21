package singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Singleton singleton =  Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
    }
}