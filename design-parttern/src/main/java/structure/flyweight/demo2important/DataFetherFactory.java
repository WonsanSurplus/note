package structure.flyweight.demo2important;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
public class DataFetherFactory {
    private static final Map<String, DataFether> fetherMap = new HashMap<>();

    public static DataFether getByCode(String code) {
        if (Objects.isNull(fetherMap.get(code))) {
            return fetherMap.get(DataFetherTypeEnum.DEFAULT.getCode());
        }
        return fetherMap.get(code);
    }

    public static void register(String code, DataFether dataFether) {
        //log.info("code:{}注册，处理类:{}", code, handler);
        fetherMap.put(code,dataFether);
    }


}
