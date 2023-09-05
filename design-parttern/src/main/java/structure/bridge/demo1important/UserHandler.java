package structure.bridge.demo1important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public class UserHandler implements BaseHandler{
    @Override
    public void queryAll(String msg) {
        System.out.println("查询所有USER..........." + msg);
    }
}
