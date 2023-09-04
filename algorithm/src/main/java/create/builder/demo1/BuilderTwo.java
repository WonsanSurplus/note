package create.builder.demo1;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class BuilderTwo extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("a2");
    }

    @Override
    public void buildPartB() {
        product.setPartB("b2");
    }

    @Override
    public void buildPartC() {
        product.setPartC("c3");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
