package behavior.strategy.demo1;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.sellsManShow();
    }
}
