package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 *
 * computer不支持tf卡，所以为DMTFcard创建适配器
 */
public class AdapterTF_Class extends DMTFcard implements SDCard {

    @Override
    public String readSD() {
        return super.readTF();
    }

    @Override
    public void writeSd(String msg) {
        super.writeTF(msg);
    }
}
