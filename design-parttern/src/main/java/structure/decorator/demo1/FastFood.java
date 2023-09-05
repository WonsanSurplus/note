package structure.decorator.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
@Data
@AllArgsConstructor
public abstract class FastFood {
    private float price;
    private String desc;
    //获取价格
    public abstract float cost();
}
