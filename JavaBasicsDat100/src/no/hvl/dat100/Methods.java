package no.hvl.dat100;

public class Methods {
    public static void main(String[] args) {
        System.out.println(primeNumber(43));
        System.out.println(primeNumber(42));
        System.out.println(gcd(42,7));
    }


    //Find is a number is prime
    public static boolean primeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i < 10; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }


    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        } return a;
    }



}

