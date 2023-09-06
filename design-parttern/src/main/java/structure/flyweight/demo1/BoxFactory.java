package structure.flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class BoxFactory {
    private Map<String, AbstractBox> boxMap;

    public BoxFactory() {
        this.boxMap = new HashMap<>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        boxMap.put("I", iBox);
        boxMap.put("L", lBox);
        boxMap.put("O", oBox);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return boxMap.get(key);
    }
}
