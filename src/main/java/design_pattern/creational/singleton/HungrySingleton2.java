package design_pattern.creational.singleton;

/**
 * 饿汉2 枚举实现
 * 用枚举则可以保证线程安全、反射安全、序列化安全
 */
public enum HungrySingleton2 {
    INSTANCE;

    private Resource instance;

    // 默认就是private的，因为无法在外部创建枚举类的实例
    HungrySingleton2() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }

}

