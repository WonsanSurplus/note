package create.singlton;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 * 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 * 双重检查
 * volatile 保证指令不会重新排序
 */
public class SingltonLazyDemo2 {
    private static volatile SingltonLazyDemo2 INSTANCE;

    private SingltonLazyDemo2() {
        //解决反射破坏单例的情况
        if (INSTANCE != null) {
            throw new RuntimeException();
        }
    }


    public static SingltonLazyDemo2 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingltonLazyDemo2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingltonLazyDemo2();
                }
            }
        }
        return INSTANCE;
    }

    public void show(){
        System.out.println("SingltonLazyDemo2  show====");
    }

}
