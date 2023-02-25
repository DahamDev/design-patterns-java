package org.example.chainOfResponsibility;

public abstract class TransactionProcessor {

    protected TransactionProcessor nextProcessor;

    public void process(){
    }

    public void setNextProcessor(TransactionProcessor nextProcessor){
        this.nextProcessor=nextProcessor;
    }

}
