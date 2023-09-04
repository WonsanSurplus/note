package structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
public class LogCommonService implements MethodInterceptor {

    private CommonService commonService = new CommonService();

    /**
     *
     * @param o 代理对象
     * @param method 真实对象中的方法的Method实例
     * @param objects 实际参数
     * @param methodProxy 代理对象中的方法的method实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增加打印日志《《《《《");
        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("增加打印日志》》》》》");
        return res;
    }

    public CommonService getCommonService(){
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer =new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(commonService.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        CommonService obj = (CommonService) enhancer.create();
        return obj;
    }
}
