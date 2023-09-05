package structure.bridge.demo1important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class TinyAppService extends OrderService{
    public TinyAppService(BaseHandler handler) {
        super(handler);
    }

    @Override
    public void queryOrders(String msg) {
        handler.queryAll(msg);

    }
}
