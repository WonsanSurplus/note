package structure.decorator.demo1;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
