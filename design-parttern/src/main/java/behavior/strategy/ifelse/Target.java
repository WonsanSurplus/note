package behavior.strategy.ifelse;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class Target {
    public static void main(String[] args) {

        //if-else比较多时，而且里面逻辑也比较复杂，可以改成策略模式替换

        String strategy = "fast";
        if ("fast".equals(strategy)){
            // 快速执行
            System.out.println("fast");
        }else if ("normal".equals(strategy)){
            // 正常执行
            System.out.println("normal");
        }else if ("smooth".equals(strategy)){
            // 平滑执行
            System.out.println("smooth");
        }else if ("slow".equals(strategy)){
            // 慢慢执行
            System.out.println("slow");
        }

    }
}
