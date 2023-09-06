package behavior.templatemethod;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public abstract class BaseHandler {
    public void part1() {
        System.out.println("11111111");
    }

    public void part2() {
        System.out.println("22222222");
    }

    public abstract void part3();
    public abstract void part4();

    public void part5() {
        System.out.println("55555555");
    }

    //加final防止修改顺序
    public final void template(){
        part1();
        part2();
        part3();
        part4();
        part5();
    }
}
