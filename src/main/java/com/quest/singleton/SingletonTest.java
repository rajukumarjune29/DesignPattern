package com.quest.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Printer<String> printer=new NormalPrinter<>();
        PrinterUtility printerUtility= PrinterUtility.getInstance();
        System.out.println( printerUtility.print(printer,"Hi Dear"));
        Printer<Double> printer1=new NormalPrinter<>();
        PrinterUtility printerUtility1= PrinterUtility.getInstance();
        System.out.println( printerUtility1.print(printer1,90.00));
    }
}
