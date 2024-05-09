package com.quest.singleton;

public class PrinterUtility extends CommonsUtils{

    private static PrinterUtility printerUtility=null;

    private PrinterUtility(){

    }
    public static PrinterUtility getInstance(){
        if (printerUtility==null){
            printerUtility=new PrinterUtility();
        }
        return printerUtility;
    }

    public <T> String print(Printer<T> printer, T  printData){
     return printer.print(printData);
    }
}
