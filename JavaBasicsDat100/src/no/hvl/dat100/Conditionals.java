package no.hvl.dat100;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {


        //Check if a number is even or odd

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }


        // Find if a person is an adult
        /*
        System.out.println("Write your age : ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("You are not an adult.");
        } else {
            System.out.println("You are an adult.");
        }


        //Grades
        System.out.println("Enter your mark: ");
        int mark = scanner.nextInt();
        if (mark > 90) {
            System.out.println("You get A.");
        } else if (mark > 80) {
            System.out.println("You get B.");
        } else if (mark > 70) {
            System.out.println("You get C.");
        } else if (mark > 60) {
            System.out.println("You get E.");
        } else if (mark > 50) {
            System.out.println("You get D.");
        } else if (mark > 40) {
            System.out.println("You got F.");
        }

         */


        // day number
        /*
        System.out.println("Enter day number: ");
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("It is manday.");
        } else if (day == 2) {
            System.out.println("It is tuesday. ");
        } else if (day == 3) {
            System.out.println("It is wednesday.");
        } else if (day == 4) {
            System.out.println("It is thursday.");
        } else if (day == 5) {
            System.out.println("It is friday. ");
        } else if (day == 6) {
            System.out.println("It is saturday.");
        } else if (day == 7) {
            System.out.println("It is sunday. ");
        } else {
            System.out.println("It is not a valid day number.");
        }

         */


        //Use switch
        /*
        int d=3;
        switch(d){
            case 1 :
                System.out.println("Manday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
        }

         */
        System.out.println("Write a number : ");
        int daynummber=scanner.nextInt();
        switch (daynummber){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }









        // Find type of websites
        /*
        System.out.println("Type url : ");
        String url=scanner.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));
        if ( protocol.equals("http"))
            System.out.println("It is hyppertext transfer protocol.");
        else if ( protocol.equals("ftp"))
            System.out.println("It is  File transfer protocol.");
        String ext=url.substring(url.indexOf(".")+1);
        if ( ext.equals(".com"))
            System.out.println("It is a commercial website.");
        else if ( ext.equals(".org"))
            System.out.println("It is a organizational website.");

         */

        //Use switch case
        System.out.println("Write url : ");
        String url=scanner.nextLine();
        scanner.nextLine();
        String ext= url.substring(url.lastIndexOf(".")+1);
        switch(ext){
            case "com" : System.out.println("Commercial");
            break;
            case "org" : System.out.println("Organization");
                break;
            case "edu" : System.out.println("educational");
                break;
            default: System.out.println("Not valid");

        }


        // 

}}
