package structure.decorator.demo1;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class Egg extends Garnish{
    public Egg(FastFood food) {
        super(food, 1, "加鸡蛋一块钱");
    }

    @Override
    public float cost() {
        return getPrice() + getFood().getPrice();
    }
}
