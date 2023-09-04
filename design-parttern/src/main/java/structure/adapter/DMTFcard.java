package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class DMTFcard implements TFcard{
    @Override
    public String readTF() {
        return "大迈TF卡";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("大迈TF卡写入。。。" + msg);
    }
}
