package structure.bridge.demo1important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public abstract class OrderService {
    protected BaseHandler handler;

    public OrderService(BaseHandler handler) {
        this.handler = handler;
    }

    public abstract void queryOrders(String msg);

}
