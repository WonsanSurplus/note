package create.cloneable.shallowclone;

import lombok.Data;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 *
 * 奖状：除了姓名都一样，使用原型模式
 *
 * 属性只有一个string类型，可以浅克隆
 */
@Data
public class Citation implements Cloneable{

    private String name;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
