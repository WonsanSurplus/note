package structure.bridge.demo1important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        UserHandler userHandler = new UserHandler();
        OrderHandler orderHandler = new OrderHandler();

        FeedsService feedsService = new FeedsService(userHandler);
        feedsService.queryOrders("feed查询用户");
        FeedsService feedsService2 = new FeedsService(orderHandler);
        feedsService2.queryOrders("feed查询订单");

        TinyAppService tinyAppServiceUser = new TinyAppService(userHandler);
        tinyAppServiceUser.queryOrders("小程序查询用户");
        TinyAppService tinyAppServiceOrder = new TinyAppService(orderHandler);
        tinyAppServiceOrder.queryOrders("小程序查询订单");

    }
}
