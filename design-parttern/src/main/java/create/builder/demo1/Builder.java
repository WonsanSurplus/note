package create.builder.demo1;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public abstract Product getProduct();

}
