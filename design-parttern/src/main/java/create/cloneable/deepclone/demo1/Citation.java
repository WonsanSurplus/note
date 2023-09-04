package create.cloneable.deepclone.demo1;

import lombok.Data;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 *
 * 奖状属性为学生，需要深克隆
 * 方法一：重写clone方法时属性中的student也调用clone
 */
@Data
public class Citation implements Cloneable {
    private Student student;


    @Override
    protected Citation clone() throws CloneNotSupportedException {
        student = this.student.clone();
        return (Citation) super.clone();
    }
}
