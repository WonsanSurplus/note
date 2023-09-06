package behavior.strategy.ifelse;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class NormalStrategy implements Strategy{
    @Override
    public void run() {
        System.out.println("正常执行逻辑");
    }
}
