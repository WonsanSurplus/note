package structure.decorator.demo1;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        //只点炒饭
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.cost());

        Egg egg = new Egg(friedRice);
        System.out.println(egg.cost());
    }
}
