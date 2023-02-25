package org.example.factorydesignpattern;

public interface FileHandler {

    void changeDir(String to);
    void deleteDir(String dir);
    void copyDir(String dir, String to);
}
