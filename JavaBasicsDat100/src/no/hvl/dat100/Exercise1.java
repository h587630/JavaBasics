package no.hvl.dat100;

public class Exercise1 {
    public static void main (String[] args) {

        // 1st part
        /*
        String a= showInputDialog("Age:");
        String b= showInputDialog("Age og your dog:");

        double c=parseDouble(a);
        double d=parseDouble(b);
        System.out.println(" Your age is : "+ c+ " your dog age is: "+ d);

         */

        // Roots of Quadratic equations
/*
        int a, b,c;
        double root1, root2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        a = scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        double d=(Math.sqrt(b*b-4*a*c));
        root1=(-b+d)/(2*a);
        root2=(-b-d)/(2*a);
        System.out.println("root1 is : "+ root1+ " root2 is : "+ root2);
*/

        //Calculate area of a triangle
        /*
        Scanner sc=new Scanner(System.in);
        float height,base, area;

        System.out.println("Write values for height and base : ");
        height=sc.nextFloat();
        base=sc.nextFloat();

        area=0.5f * height*base;
        System.out.println("The area is : " + area);
*/




        // Area of traiangle using three sides
        /*
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        float s;
        System.out.println("Enter tre numbers : ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        s=0.5f*(a+b+c);
        float area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of traiangle is : "+ area);
*/
        // int a= (int)pow(2,3);


        // Swaping of two numbers using bitwise XOR operation
        /*
        int a =10; int b= 15;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
        int c= a<<1; //Shift a four bits to the left
        int d= ( b | 12);
        System.out.println("C is: "+ c);
        System.out.println("D is : "+d);
        */

        



    }
}
