package paixu;

public class Singleton1 {
    // ˽�й���
    public Singleton1() {}

//    private static Singleton1 single = new Singleton1();

    // ��̬��������
    public  Singleton1 getInstance() {
        return  new Singleton1();
    }
}
