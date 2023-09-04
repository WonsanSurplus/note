package create.builder.demo1;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class BuilderOne extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("a1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("b1");
    }

    @Override
    public void buildPartC() {
        product.setPartC("c1");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
