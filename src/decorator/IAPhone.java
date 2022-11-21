package decorator;

public class IAPhone extends PhoneDecorator {


    public IAPhone(Phone phone) {
        super(phone);
    }
    @Override
    public void make(){
        super.make();
        System.out.println(" IA: -> 4G");
    };
}
