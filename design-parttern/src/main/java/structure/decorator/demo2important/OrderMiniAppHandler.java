package structure.decorator.demo2important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class OrderMiniAppHandler extends OrderDecotator{
    @Override
    void show() {
        System.out.println("小程序订单中心额外逻辑。。。。。。。。");
        super.show();
    }

    public OrderMiniAppHandler(BaseHandler handler) {
        super(handler);
    }
}
