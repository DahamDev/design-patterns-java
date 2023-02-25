package org.example.factorydesignpattern;

public class WindowsFileHandler implements FileHandler{
    @Override
    public void changeDir(String to) {
        System.out.println("changed to  C://usr/admin/documents/");
    }

    @Override
    public void deleteDir(String dir) {
        System.out.println("deleted C://usr/admin/documents/");
    }

    @Override
    public void copyDir(String dir, String to) {
        System.out.println("copied "+ dir+" to "+to);
    }
}
