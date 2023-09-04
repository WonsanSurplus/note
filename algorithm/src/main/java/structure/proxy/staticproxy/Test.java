package structure.proxy.staticproxy;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        RegularChannel regularChannel = new RegularChannel();
        regularChannel.sellTicket();
        TicketScalper ticketScalper = new TicketScalper();
        ticketScalper.sellTicket();
    }
}
