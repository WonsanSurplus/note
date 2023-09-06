package behavior.strategy.ifelse;

import java.util.HashMap;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class Test {
    // 初始化map，将策略放入
    private static HashMap<String,Strategy > map = new HashMap<String,Strategy >(){
        {
            put("FastStrategy",new FastStrategy());
            put("NormalStrategy",new NormalStrategy());
            put("SmoothStrategy",new SmoothStrategy());
            put("SlowStrategy",new SlowStrategy());
        }
    };

    // 构建方法，通过传入的key触发对应的策略
    public static void testStrategy(String param) {
        Strategy strategy  = map.get(param);
        strategy.run();
    }

    public static void main(String[] args) {
        testStrategy("NormalStrategy");
    }

}
