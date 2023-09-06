package behavior.strategy.ifelse;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class SlowStrategy implements Strategy{
    @Override
    public void run() {
        System.out.println("慢速执行逻辑");
    }
}
