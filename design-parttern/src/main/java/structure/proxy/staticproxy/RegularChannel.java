package structure.proxy.staticproxy;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class RegularChannel implements SellTickets{
    @Override
    public void sellTicket() {
        System.out.println("官方卖票，15一张。。。。。。。。。");
    }
}
