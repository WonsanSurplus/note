package behavior.strategy.demo1;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sellsManShow(){
        strategy.show();
    }
}
