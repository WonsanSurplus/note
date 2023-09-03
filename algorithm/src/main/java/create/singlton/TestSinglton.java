package create.singlton;

import org.junit.Test;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 */
public class TestSinglton {

    @Test
    public void testSingltonHunger(){
        SingltonHungryDemo1 singltonHungryDemo1 = SingltonHungryDemo1.getInstance();
        SingltonHungryDemo1 singltonHungryDemo1_1 = SingltonHungryDemo1.getInstance();
        System.out.println(singltonHungryDemo1_1==singltonHungryDemo1);
        singltonHungryDemo1.show();
        SingltonHungryDemo2 singltonHungryDemo2 = SingltonHungryDemo2.getInstance();
        singltonHungryDemo2.show();
    }

    @Test
    public void testSingltonLazy(){
        SingltonLazyDemo2 singltonLazyDemo2 = SingltonLazyDemo2.getInstance();
        SingltonLazyDemo2 singltonLazyDemo2_2 = SingltonLazyDemo2.getInstance();
        System.out.println(singltonLazyDemo2_2 == singltonLazyDemo2);
        singltonLazyDemo2.show();

        SingltonLazyDemo1 singltonLazyDemo1 = SingltonLazyDemo1.getInstance();
        singltonLazyDemo1.show();
        SingltonLazyDemo3 singltonLazyDemo3 = SingltonLazyDemo3.getInstance();
        singltonLazyDemo3.show();
    }
}
