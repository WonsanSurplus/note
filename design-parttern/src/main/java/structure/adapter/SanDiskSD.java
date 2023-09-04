package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class SanDiskSD implements SDCard{
    @Override
    public String readSD() {
        return "读取到。。。闪迪";
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("闪迪卡写入。。。。" + msg);
    }
}
