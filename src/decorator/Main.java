package decorator;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.make();

        IAPhone iaPhone = new IAPhone(new BasicPhone());
        iaPhone.make();

        NextGenPhone nextGenPhone = new NextGenPhone(new IAPhone(new BasicPhone()));
        nextGenPhone.make();
    }
}
