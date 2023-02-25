package org.example.chainOfResponsibility;

public class CreditCardProcessor extends TransactionProcessor{

    public void process(int amount){
        if(amount<1000){
            System.out.println("process by credit card");
        }
        else nextProcessor.process();
    }
}
