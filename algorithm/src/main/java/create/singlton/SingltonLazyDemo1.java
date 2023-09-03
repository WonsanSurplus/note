package create.singlton;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 * 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 */
public class SingltonLazyDemo1 {
    private static SingltonLazyDemo1 INSTANCE;

    private SingltonLazyDemo1() {
    }

    public static SingltonLazyDemo1 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SingltonLazyDemo1();
        }
        return INSTANCE;
    }

    public void show(){
        System.out.println("SingltonLazyDemo1  show====");
    }

}
