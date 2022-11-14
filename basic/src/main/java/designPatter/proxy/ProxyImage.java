package designPatter.proxy;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/26 22:47
 */
public class ProxyImage implements Image{

    private RealImage realImage;

    private String fileName;

    public ProxyImage( String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
