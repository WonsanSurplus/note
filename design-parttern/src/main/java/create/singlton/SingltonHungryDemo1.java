package create.singlton;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 * 饿汉式：类加载就会导致该单实例对象被创建
 */
public class SingltonHungryDemo1 {

    private static SingltonHungryDemo1 INSTANCE = new SingltonHungryDemo1();
    private SingltonHungryDemo1() {

    }

    public static SingltonHungryDemo1 getInstance() {
        return INSTANCE;
    }

    public void show(){
        System.out.println("SingltonHungryDemo1  show====");
    }
}
