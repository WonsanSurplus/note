package create.builder.demo1;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new BuilderOne());
        Product product1 = director.construct();
        System.out.println(product1);

        Director director1 = new Director();
        director1.setBuilder(new BuilderTwo());
        Product product2 = director1.construct();
        System.out.println(product2);
    }
}
