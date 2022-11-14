package designPatter.proxy;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/26 22:48
 */
public class ProxyTest {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("xie");
        proxyImage.display();
        proxyImage.display();
    }
}
