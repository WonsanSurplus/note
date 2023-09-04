package create.singlton;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 * 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 * 推荐：静态内部类
 */
public class SingltonLazyDemo3 {
    private SingltonLazyDemo3(){}

    //防止序列化破坏单例
    private Object readResolve(){
        return SingltonHolder.INSTANCE;
    }

    public static SingltonLazyDemo3 getInstance() {
        return SingltonHolder.INSTANCE;
    }

    private static class SingltonHolder{
        private static final SingltonLazyDemo3 INSTANCE = new SingltonLazyDemo3();
    }

    public void show(){
        System.out.println("SingltonLazyDemo3  show====");
    }
}
