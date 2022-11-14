package designPatter.singleton;

/**
 * @author xiehongfei
 * @description 史上最牛B的单例模式的实现方式
 * @date 2022/11/9 23:05
 */
public class SuperLazySingleton {

    private static boolean initialized = false;

    private SuperLazySingleton() {
        synchronized (SuperLazySingleton.class) {
            if(!initialized) {
                initialized = true;
            } else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    public static SuperLazySingleton getInstance() {
        return LazyHolder.LAZY_HOLDER;
    }

    private static class LazyHolder {
        private static final SuperLazySingleton LAZY_HOLDER = new SuperLazySingleton();
    }
}
