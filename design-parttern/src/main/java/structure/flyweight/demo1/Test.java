package structure.flyweight.demo1;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        BoxFactory boxFactory = new BoxFactory();
        AbstractBox i = boxFactory.getBox("I");
        i.display("red");
    }
}
