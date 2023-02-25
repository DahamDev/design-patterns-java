package org.example.factorydesignpattern;

public class LinuxFileHandler implements FileHandler{
    @Override
    public void changeDir(String to) {
        System.out.println("changed to  /root/opt/etc");
    }

    @Override
    public void deleteDir(String dir) {
        System.out.println("deleted /root/etc/system.d");
    }

    @Override
    public void copyDir(String dir, String to) {
        System.out.println("copied /file.txt /root/data");
    }
}
