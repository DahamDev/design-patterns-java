package org.example.factorydesignpattern;

public class FileHandlerFactory {

    public static FileHandler getHandler(String system) throws ClassNotFoundException {
        if(system.equalsIgnoreCase("windows")){
            return new WindowsFileHandler();
        } else if (system.equalsIgnoreCase("linux")) {
            return new LinuxFileHandler();
        }
        else throw new ClassNotFoundException("No type found");
    }
}
