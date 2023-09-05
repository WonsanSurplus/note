package structure.decorator.demo2important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class DefaultOrderHandler extends OrderDecotator{
    public DefaultOrderHandler(BaseHandler handler) {
        super(handler);
    }

    @Override
    void show() {
        System.out.println("order中额外逻辑。。。。。");
        super.show();
    }
}
