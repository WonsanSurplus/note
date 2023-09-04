package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 *
 * computer不支持tf卡，所以为DMTFcard创建适配器
 */
public class AdapterTF implements SDCard {

    private DMTFcard dmtFcard;

    public AdapterTF(DMTFcard dmtFcard) {
        this.dmtFcard = dmtFcard;
    }

    @Override
    public String readSD() {
        return dmtFcard.readTF();
    }

    @Override
    public void writeSd(String msg) {
        dmtFcard.writeTF(msg);
    }
}
