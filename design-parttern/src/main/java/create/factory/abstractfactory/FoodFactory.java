package create.factory.abstractfactory;

import create.factory.product.Drink;
import create.factory.product.Fruit;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public interface FoodFactory {
    Fruit getFruit();

    Drink getDrink();
}
