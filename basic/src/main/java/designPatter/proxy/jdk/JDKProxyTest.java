package designPatter.proxy.jdk;

/**
 * JDK动态代理模式
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new UserDao());
        ProxyFactory proxyFactory2 = new ProxyFactory(new UserDao2());
        IUserDao instance = (IUserDao)proxyFactory.getInstance();
        IUserDao instance2 = (IUserDao)proxyFactory2.getInstance();
        instance.selectUser();
        instance2.selectUser();
    }
}
