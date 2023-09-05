package structure.decorator.demo2important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        DefaultBaseHandler defaultBaseHandler = new DefaultBaseHandler();
        //defaultBaseHandler.show();
        DefaultOrderHandler orderHandler = new DefaultOrderHandler(defaultBaseHandler);
        orderHandler.show();
        System.out.println("==============");
        OrderMiniAppHandler miniAppHandler = new OrderMiniAppHandler(defaultBaseHandler);
        miniAppHandler.show();
    }
}
