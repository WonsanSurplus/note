package create.factory.abstractfactory;

import create.factory.product.Apple;
import create.factory.product.Drink;
import create.factory.product.Fruit;
import create.factory.product.Orange;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 * 商店A只买苹果和橙汁
 */
public class AstoreFactory implements FoodFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Drink getDrink() {
        return new Orange();
    }
}
