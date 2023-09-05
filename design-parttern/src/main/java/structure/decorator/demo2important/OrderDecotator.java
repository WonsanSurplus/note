package structure.decorator.demo2important;

/**
 * @Date: 2023/9/5 005
 * @Author: zs
 */
public abstract class OrderDecotator extends BaseHandler{

    private BaseHandler handler;

    public OrderDecotator(BaseHandler handler) {
        this.handler = handler;
    }

    @Override
    void show() {
       handler.show();
    }
}
