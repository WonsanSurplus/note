package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public interface TFcard {
    //读取
    String readTF();

    //写入
    void writeTF(String msg);
}
