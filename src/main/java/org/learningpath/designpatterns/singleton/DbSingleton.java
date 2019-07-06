package org.learningpath.designpatterns.singleton;

//static single instance which is lazy loaded and thread safe
//double check
public class DbSingleton {
    private static volatile DbSingleton instance = null;

    //to avoid instance creation using reflection
    private DbSingleton() {
        if (instance != null ){
            throw new RuntimeException("create instances using getInstance()");
        }
    };

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);
    }
}
