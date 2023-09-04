package create.builder.demo2;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .partA("a")
                .partC("c")
                .partB("b")
                .createProduct();
        System.out.println(product);
    }
}
