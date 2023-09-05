package structure.decorator.demo1;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
