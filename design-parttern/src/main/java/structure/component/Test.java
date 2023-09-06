package structure.component;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        Menu smdc = new Menu("扫码点餐", 1);
        MenuItem bdfx = new MenuItem("波动分析", 2);
        MenuItem sjgl = new MenuItem("数据管理", 2);
        smdc.add(bdfx);
        smdc.add(sjgl);
        smdc.print();
    }
}
