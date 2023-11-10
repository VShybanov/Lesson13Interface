public class Lesson13Interface {
    public static void main(String[] args) {
        System.out.println("Smartphones = Androids:");
        Smartphones smartAndroid = new Androids();
        smartAndroid.sms();
        smartAndroid.call();
        smartAndroid.internet();
        System.out.println();

        System.out.println("Androids:");
        Androids android = new Androids();
        android.sms();
        android.call();
        android.internet();
        android.os();
        System.out.println();

        System.out.println("Smartphones = IPhones:");
        Smartphones smartIPhone = new IPhones();
        smartIPhone.sms();
        smartIPhone.call();
        smartIPhone.internet();
        System.out.println();

        System.out.println("IPhones:");
        IPhones iphone = new IPhones();
        iphone.sms();
        iphone.call();
        iphone.internet();
        iphone.os();
        System.out.println();

        System.out.println("LinuxOS = Androids:");
        LinuxOS linuxOS = new Androids();
        linuxOS.os();
        System.out.println();

        System.out.println("IOS = IPhones:");
        IOS ios = new IPhones();
        ios.os();
    }
}
