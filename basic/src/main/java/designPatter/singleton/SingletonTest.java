package designPatter.singleton;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 18:16
 */
public class SingletonTest {

    public static void main(String[] args) {
        // 饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton.hashCode());
        System.out.println(hungrySingleton2.hashCode());
        System.out.println(hungrySingleton == hungrySingleton2);

        // 懒汉式
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton2.hashCode());
        System.out.println(lazySingleton == lazySingleton2);

        // 静态内部类式
        StaticInnerClassSingleton staticInnerClassSingleton1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton2 = StaticInnerClassSingleton.getInstance();
        System.out.println(staticInnerClassSingleton1.hashCode());
        System.out.println(staticInnerClassSingleton2.hashCode());
        System.out.println(staticInnerClassSingleton1 == staticInnerClassSingleton2);

        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}
