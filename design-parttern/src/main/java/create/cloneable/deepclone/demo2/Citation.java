package create.cloneable.deepclone.demo2;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 *
 * 奖状属性为学生，需要深克隆
 * 方法二：属性中的对象不是自己写的也不让修改时
 * 要使用对象流（这个前提是都要实现Serializable接口
 */
@Data
public class Citation implements Cloneable, Serializable {
    private Student student;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
