package create.cloneable.deepclone.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2023/9/3 003
 * @Author: zs
 */
@Data
@AllArgsConstructor
public class Student implements Serializable {
    private String name;
    private String address;

}
