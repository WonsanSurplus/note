package structure.adapter;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class Computer {
    //此电脑只能读取SD卡内容
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd==null");
        }
        return sdCard.readSD();
    }
}
