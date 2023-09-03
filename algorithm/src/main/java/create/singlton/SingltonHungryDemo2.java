package create.singlton;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 * 饿汉式：类加载就会导致该单实例对象被创建
 */
public class SingltonHungryDemo2 {

    private static final SingltonHungryDemo2 INSTANCE;

    static {
        INSTANCE = new SingltonHungryDemo2();
    }
    private SingltonHungryDemo2() {}

    public static SingltonHungryDemo2 getInstance() {
        return INSTANCE;
    }

    public void show(){
        System.out.println("SingltonHungryDemo2  show====");
    }
}
