public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone call");
    }
    @Override
    public void sms() {
        System.out.println("iPhone SMS");
    }
    @Override
    public void internet() {
        System.out.println("iPhone internet");
    }
    @Override
    public void os() {
        System.out.println("iOS");
    }
}
