package behavior.strategy.ifelse;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class FastStrategy implements Strategy{
    @Override
    public void run() {
        System.out.println("快速执行逻辑");
    }
}
