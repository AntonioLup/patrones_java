package decorator;


public class NextGenPhone extends PhoneDecorator {


    public NextGenPhone(Phone phone) {
        super(phone);
    }
    @Override
    public void make(){
        super.make();
        System.out.println(" -> 5G");
        System.out.println(" -> VolTe");
    };
}
