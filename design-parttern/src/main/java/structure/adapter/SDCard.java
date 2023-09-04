package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public interface SDCard {
    //读取
    String readSD();

    //写入
    void writeSd(String msg);

}
