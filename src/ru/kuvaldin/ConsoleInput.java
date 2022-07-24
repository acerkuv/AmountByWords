package ru.kuvaldin;

import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    protected String dateInput(){
        Scanner scanner = new Scanner(System.in);
        String typedData = scanner.nextLine();
        return typedData;
    }

//    private boolean checkTrueInput( String input){
//
//    }
}
