package structure.facade;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 * <p>
 * 创建facade对外暴露接口
 */

public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            close();
        } else {
            System.out.println("听不懂。。。。。。。。。");
        }
    }

    private void on() {
        System.out.println("起床了");
        light.on();
        tv.on();
        airCondition.on();
    }

    private void close() {
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }


}
