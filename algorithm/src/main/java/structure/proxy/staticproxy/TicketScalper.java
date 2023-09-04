package structure.proxy.staticproxy;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class TicketScalper implements SellTickets{
    private RegularChannel regularChannel = new RegularChannel();
    @Override
    public void sellTicket() {
        System.out.println("黄牛收取额外费用：100！！！");
        regularChannel.sellTicket();
    }
}
