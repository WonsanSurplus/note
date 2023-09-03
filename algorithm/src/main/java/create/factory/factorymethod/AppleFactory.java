package create.factory.factorymethod;

import create.factory.product.Apple;
import create.factory.product.Fruit;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public class AppleFactory implements FoodFactory{
    @Override
    public Fruit getFood() {
        return new Apple();
    }
}
