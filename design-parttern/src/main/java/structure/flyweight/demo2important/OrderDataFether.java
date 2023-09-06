package structure.flyweight.demo2important;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * @Date: 2023/9/6 006
 * @Author: zs
 */
@Component
public class OrderDataFether implements DataFether{
    @Override
    public void show() {
        System.out.println("order.........");

    }

    @PostConstruct
    private void register(){
        DataFetherFactory.register(DataFetherTypeEnum.DEFAULT.getCode(), this);
    }
}
