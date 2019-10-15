package paixu;

public class Singleton1 {
    // 私有构造
    public Singleton1() {}

//    private static Singleton1 single = new Singleton1();

    // 静态工厂方法
    public  Singleton1 getInstance() {
        return  new Singleton1();
    }
}
