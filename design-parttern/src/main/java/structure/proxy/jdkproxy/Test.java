package structure.proxy.jdkproxy;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        TicketScalper ticketScalper = new TicketScalper();
        ticketScalper.getProxyObject().sellTicket();
    }
}
