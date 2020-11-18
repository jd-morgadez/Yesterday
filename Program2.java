/*
    Name: Doiminic Morgadez
    Class: CSC110AB - Program 2: Yesterday
    Date: 14 November 2020
*/

import java.util.Scanner;
public class Program2 {

    public static void main(String[] args) {

        // Inputs for date
        Scanner kb = new Scanner(System.in);
        // System.out.print("Please enter month, day year (as integers, separated by spaces):  ");
        int month = kb.nextInt();
        int day = kb.nextInt();
        int year = kb.nextInt();

        boolean leapYear;

        //Testing for leap year
        if(year % 400 == 0) {
            leapYear = true;
        } else if(year % 100 == 0) {
            leapYear = false;
        } else if(year % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        int notLeapDay = 28;
        int leapDay = 29;
        int normalMonth = 30;
        int extraMonth = 31;

        //output for dates according to month
        switch (month) {

            case 1:
                if(day == 1) {
                    year = year - 1;
                    System.out.print("Yesterday was: 12/31/" + year);
                } else if(day > 1 && day < 32) {
                    day = day - 1;
                    System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                }
                break;

            case 2:
                if(leapYear == true) {
                    if(day == 1) {
                        month = month - 1;
                        System.out.print("Yesterday was: " + month + "/" + extraMonth + "/" + year);
                    } else if(day > 1 && day <= 29) {
                        day = day - 1;
                        System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                    }
                } else {
                    if (day == 1) {
                        month = month - 1;
                        System.out.print("Yesterday was: " + month + "/" + extraMonth + "/" + year);
                    } else if (day > 1 && day <= 28) {
                        day = day - 1;
                        System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                    }
                }
                break;

            case 3:
                if(leapYear == true) {
                    if(day == 1) {
                        month = month - 1;
                        System.out.print("Yesterday was: " + month + "/" + leapDay + "/" + year);
                    } else if(day > 1 && day <= 31) {
                        day = day - 1;
                        System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                    }
                } else {
                    if (day == 1) {
                        month = month - 1;
                        System.out.print("Yesterday was: " + month + "/" + notLeapDay + "/" + year);
                    } else if (day > 1 && day <= 31) {
                        day = day - 1;
                        System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                    }
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(day == 1) {
                    month = month - 1;
                    System.out.print("Yesterday was: " + month + "/" + extraMonth + "/" + year);
                } else if(day > 1 && day <= 30) {
                    day = day - 1;
                    System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                }
                break;

            case 5:
            case 7:
            case 10:
            case 12:
                if(day == 1) {
                    month = month - 1;
                    System.out.print("Yesterday was: " + month + "/" + normalMonth + "/" + year);
                } else if(day > 1 && day <= 31) {
                    day = day - 1;
                    System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                }
                break;

            case 8:
                if(day == 1) {
                    month = month - 1;
                    System.out.print("Yesterday was: " + month + "/" + extraMonth + "/" + year);
                } else if(day > 1 && day <= 31) {
                    day = day - 1;
                    System.out.print("Yesterday was: " + month + "/" + day + "/" + year);
                }
                break;

        }
    }
}