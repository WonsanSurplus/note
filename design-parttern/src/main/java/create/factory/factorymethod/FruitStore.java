package create.factory.factorymethod;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
public class FruitStore {
    public FruitStore setFactory(FoodFactory factory) {
        this.factory = factory;
        return this;
    }

    private FoodFactory factory;

    public void sell(){
        factory.getFood().show();
    }

}
