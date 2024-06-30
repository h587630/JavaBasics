package no.hvl.dat100;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //While loop basic
        /*
        int i= 1;
        while(i<100){
            i=i*2;
            System.out.println(i);
        }

    System.out.println("Do while loop.................................................................................");
        int b= 1;
        do {
            System.out.println(b);
            b=b*2;
        } while (b< 100);

         */

        // Display multiplication table
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write a number you want to : ");
        int n= scanner.nextInt();
        int i= 1;
        while (i<= 10){
            int j= i*n;
            i++;
            System.out.println(n +" X " +i+" = " +j );
        }

         */
        // Find sum of n numbers
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write a number you want to : ");

        int n= scanner.nextInt();
        int sum=0;
        for (int i=0; i < n; i++){
            sum=sum+i;
            System.out.println("Sum of "+ i + " number is "+ sum);
        }

         */

        // Factorial
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write a number : ");
        int n= scanner.nextInt();
        int fact=1;
        for (int i=1; i <= n; i++) {

            fact= fact*i;
            System.out.println("Factorial of  "+i+ " is : "+fact);


         */

        //Patterns 1
        /*
        for (int a= 1; a < 6; a++){
            for( int b=1; b<6; b++){
                System.out.print(b+ " ");
            }
            System.out.println(" ");

        }
        }

         */
        //Pattern 2
        /*
         for (int a= 1; a < 6; a++){
        for( int b=1; b<6; b++){
            System.out.print( a+ " ");
        }
        System.out.println(" ");

    }
}

         */

        //Pattern 3
        /*
        for (int a= 1; a < 6; a++){
        for( int b=1; b<6; b++){
            System.out.print( b+a+ " ");
        }
        System.out.println(" ");

    }
}

         */
        //Pattern 4
        /*
        int count= 0;
        for (int a= 1; a < 6; a++){
            for( int b=1; b<6; b++){
                count ++;
                System.out.print( count+ "  *  ");
            }
            System.out.println(" ");

        }
    }

         */
        //Pattern 5
        /*
        int count=0;
        for (int a= 1; a < 6; a++){
            for( int b=1; b<6; b++){
                count++;
                System.out.format( "%02d  ", count); //format two digits.

            }
            System.out.println(" ");
            System.out.println("---------------------------");

        }

         */

        // display digits of a given number
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write a number : ");
        int number=scanner.nextInt();
        while(number > 0){
            int remainder= number % 10;
            number=number/10;
            System.out.print(remainder);
        }

         */


        //Count the digits of a number
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number : ");
        int number = scanner.nextInt();
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;

        }
        System.out.print(count);
    }

         */


        //Finding a number is Armstrong or not
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number : ");
        int givenNumber = scanner.nextInt();
        int sum = 0;
        int number= givenNumber;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            sum= sum+(remainder*remainder*remainder);
        }
        if(sum == givenNumber){
            System.out.println("It is an armestrong number "+ sum);
        }else{
        System.out.print("It is not an armestrong number "+ sum );
    }

         */


        //Reverse of a given number
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write a number : ");
        int number=scanner.nextInt();
       int  reverse= 0;
        while(number > 0){
            int remainder= number % 10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.print("Reverse of the given number is : "+reverse);

}
         */

        // Check if a number is palindrome
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number : ");
        int number = scanner.nextInt();
        int givenNumberOriginal= number;
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of the given number is : " + reverse);

        if(reverse == givenNumberOriginal){
            System.out.println("It is palindrome.");
        }else{
            System.out.println("It is not palindrome.");
        }


         */


        // Display a number in words
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give a number: ");
        int givenNumber=scanner.nextInt();
        int r;
        String str="";
        while(givenNumber> 0){
            r=givenNumber%10;
            givenNumber=givenNumber/10;
            str=str+r;

        }
        System.out.println(str);
        char c;
        for(int i=0; i < str.length(); i++){
            c=str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.println("nine ");
                    break;
                case '9':
                    System.out.println();
                    break;
                default:
                    System.out.println("Not valid.");
                    break;

            }
        }

         */

        //Display fibonacci series
        Scanner scanner=new Scanner(System.in);
        System.out.println("Fibonacci series ");
        System.out.println("Give number of terms:  ");
        int term=scanner.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a);
        for(int i = 1; i <= term; i++){

            c= a+b;
            System.out.print(" , "+c);
            a= b;
            b= c;

        }

        int r;



    }
}


