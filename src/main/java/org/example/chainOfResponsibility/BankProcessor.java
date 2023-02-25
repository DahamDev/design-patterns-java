package org.example.chainOfResponsibility;

public class BankProcessor extends TransactionProcessor{

    public void process(int amount){
        if(amount<500){
            System.out.println("process at bank");
        }else {
            nextProcessor.process();
        }
    }
}
