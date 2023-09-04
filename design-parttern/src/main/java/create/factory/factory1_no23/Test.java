package create.factory.factory1_no23;

import create.factory.product.Fruit;

/**
 * @Date: 2023/9/2 002
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        Fruit fruit = FoodFactory.getFood("a");
        fruit.show();
        Fruit fruit1 = FoodFactory.getFood("b");
        fruit1.show();
    }
}
