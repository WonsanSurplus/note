package create.factory.abstractfactory;

import create.factory.product.Banana;
import create.factory.product.Coke;
import create.factory.product.Drink;
import create.factory.product.Fruit;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 * 商店B只卖香蕉和可乐
 */
public class BstoreFactory implements FoodFactory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Drink getDrink() {
        return new Coke();
    }
}
