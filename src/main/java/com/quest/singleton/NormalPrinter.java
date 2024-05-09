package com.quest.singleton;

public class NormalPrinter<T> implements Printer<T>{
    @Override
    public String print(T printData) {
        System.out.println(printData);
        return "Print Successful";
    }
}
