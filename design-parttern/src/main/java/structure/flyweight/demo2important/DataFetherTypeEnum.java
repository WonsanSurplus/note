package structure.flyweight.demo2important;

import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Classname: OrderDataTypeEnum
 * @Date: 2023/8/27 027
 * @Author: zs
 */
@AllArgsConstructor
@Getter
public enum DataFetherTypeEnum {
    DEFAULT("DEFAULT","默认"),
    ORDER("ORDER","订单");

    private String code;

    private String desc;

    static Map<String, DataFetherTypeEnum> map2code;

    static {
        map2code = Arrays.stream(DataFetherTypeEnum.values()).collect(
                Collectors.toMap(DataFetherTypeEnum::getCode, Function.identity())
        );
    }

    /**
     * 根据code获取enum
     * @param code
     * @return
     */
    public static DataFetherTypeEnum getEnumByCode(String code) {
        return StringUtils.isBlank(code) ? null : map2code.get(code);
    }
}
