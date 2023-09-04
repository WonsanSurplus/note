package structure.proxy.cglib;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Test {
    public static void main(String[] args) {
        LogCommonService service = new LogCommonService();
        CommonService commonService = service.getCommonService();
        commonService.sellTicket();
    }
}
