package create.builder.demo1;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Director {
    private Builder builder;

    public Director() {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartB();
        builder.buildPartA();
        builder.buildPartC();
        return builder.getProduct();
    }
}
