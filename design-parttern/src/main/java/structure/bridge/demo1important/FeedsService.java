package structure.bridge.demo1important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class FeedsService extends OrderService{

    public FeedsService(BaseHandler handler) {
        super(handler);
    }

    @Override
    public void queryOrders(String msg) {
        handler.queryAll(msg);

    }
}
