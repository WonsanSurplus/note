package create.builder.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String partA;
    private String partB;
    private String partC;

}
