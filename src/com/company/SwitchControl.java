package com.company;

import java.util.Scanner;

public class SwitchControl {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter days to get the months: ");
        System.out.println("Valid inputs: 28, 30, 31");
        int days = scan.nextInt();
        whichMonth(days);
    }

    public static void whichMonth(int month){//Silly switch statement that leads into an if/else statement.
        //storing categories of (days in month) into string arrays
        String[] thirtyOneDays ={"January", "March", "May", "July", "August",
                "October", "December"};
        String[] thirtyDays = {"April", "June", "September", "November"};
        String[] twentyEightDays = {"February"};

        switch (month){
            case 31: month = 31;
                     break;
            case 30: month = 30;
                     break;
            case 28: month = 28;
                     break;
            default:
                System.out.println("Error, please enter the number 28/30/31");
        }
        //passing "month" from switch statement into this if/else
        // statement because I could not print out arrays in the switch
        if(month == 31){
            System.out.println("Months with " + month + " days");
            dayPrint(thirtyOneDays);
        } else if (month == 30){
            dayPrint(thirtyDays);
        } else{
            dayPrint(twentyEightDays);
        }
    }

    public static String[] dayPrint(String[] days){ // print method for array
        for(String x : days){
            System.out.println(x);
        }
        return days;
    }
}
