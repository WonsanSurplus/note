package create.cloneable.deepclone.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
@Data
@AllArgsConstructor
public class Student implements Cloneable{
    private String name;
    private String address;


    public Student clone(){
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
