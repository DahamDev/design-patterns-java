package org.example.singleton;

public class LazySingleton  {

    private static LazySingleton instance;
    private String name;
    private int age;

    private LazySingleton(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                if(instance==null){
                    instance = new LazySingleton("Daham", 26);
                }
            }
        }
        return instance;
    }
}
