package behavior.strategy.ifelse;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class SmoothStrategy implements Strategy{
    @Override
    public void run() {
        System.out.println("平滑执行逻辑");
    }
}
