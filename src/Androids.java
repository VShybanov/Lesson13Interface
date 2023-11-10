public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android call");
    }
    @Override
    public void sms() {
        System.out.println("Android SMS");
    }
    @Override
    public void internet() {
        System.out.println("Android internet");
    }
    @Override
    public void os() {
        System.out.println("Linux OS");
    }
}
