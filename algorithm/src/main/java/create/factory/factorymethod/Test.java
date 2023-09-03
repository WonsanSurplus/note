package create.factory.factorymethod;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore().setFactory(new AppleFactory());
        fruitStore.sell();
        FruitStore fruitStore2 = new FruitStore().setFactory(new BananaFactory());
        fruitStore2.sell();

    }
}
