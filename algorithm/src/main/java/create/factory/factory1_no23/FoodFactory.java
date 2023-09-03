package create.factory.factory1_no23;

import create.factory.product.Apple;
import create.factory.product.Banana;
import create.factory.product.Fruit;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 * 简单工厂模式，不是23中设计模式之一
 */
public class FoodFactory {

    public static Fruit getFood(String type) {
        Fruit fruit;
        switch (type) {
            case "a" :
                fruit =  new Apple();
                break;
            case "b":
                fruit = new Banana();
                break;
            default:
                throw new RuntimeException();
        }
        return fruit;
    }
}
