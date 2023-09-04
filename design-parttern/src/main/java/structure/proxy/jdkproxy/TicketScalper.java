package structure.proxy.jdkproxy;

import structure.proxy.staticproxy.RegularChannel;
import structure.proxy.staticproxy.SellTickets;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 *
 * JDK动态代理
 * TicketScalper不是代理类，而是用来生成代理类
 * 在运行过程中动态的在内存中生成
 */

public class TicketScalper {
    private structure.proxy.staticproxy.RegularChannel regularChannel = new RegularChannel();

    public structure.proxy.staticproxy.SellTickets getProxyObject(){
        return  (SellTickets) Proxy.newProxyInstance(regularChannel.getClass().getClassLoader(), regularChannel.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("黄牛又黑心的多收了100！！");
                return method.invoke(regularChannel,args);
            }
        });
    }
}
