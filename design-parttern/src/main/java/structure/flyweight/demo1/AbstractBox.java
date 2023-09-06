package structure.flyweight.demo1;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
