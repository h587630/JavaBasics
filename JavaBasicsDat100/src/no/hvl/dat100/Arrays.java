package no.hvl.dat100;

public class Arrays {
    public static void main(String[] args) {


        // One dimentional array and finding sum of elements.
        /*
        int A[] = {3, 6, 1, 7, 5, 9, 34, 2, 11, 12, 98};
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum=sum+A[i];
            System.out.print( i+" ");
            System.out.print("Sum of array is : "+sum);
        }

         */


        //Searching an element
        /*
        int A[] = {3, 6, 1, 7, 5, 9, 34, 2, 11, 12, 98};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write the number you want to check in the array.");
        int key= scanner.nextInt();
        for (int i = 0; i < A.length; i++) {
            if(A[i]== key){
                System.out.println( "Element is found at index "+ i);
                System.exit(0);
            }
            }
        System.out.println("The element not found.");
        }

        */

        // Finding the largest element and the second largest element.
        /*
        int A[]={34,1,7,5,45,21,78,76,65,8,7,453,23,20,99};
        int max1 = A[0], max2 =A[0];
        for(int i= 0; i< A.length; i++){
            if(A[i] > max1){
                max2= max1;
                max1 =A[i];
            }else if(A[i]> max2){
                max2=A[i];
            }
        }
        System.out.println("Max 1 : "+ max1);
        System.out.println("Max 2 : "+ max2);



         */

        //Rotation of an array(left and right)
        /*
        int A[]={34,1,7,5,45,21,78,76,65,8,7,453,23,20,99};
        for( int x : A){
            System.out.print(x+ " ");
        }
        System.out.println(" ");
        int temp=A[0];
        for(int i= 1; i< A.length; i++){
            A[i-1]=A[i];
    }   A[A.length-1]=temp;
        for( int x : A){
        System.out.print(x+ " ");
    }

         */

        //Rotation of an array(left and right)
/*
        int A[]={34,1,7,5,45,21,78,76,65,8,7,453,23,20,99};
        for( int x : A){
            System.out.print(x+ " ");
        }
        System.out.println(" ");
        int temp=A[A.length-1];
        for(int i= A.length-1; i> 0; i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
        for( int x : A){
            System.out.print(x+ " ");
        }
 */

        // Inserting an element
        /*
        int A[]=new int[10];
        A[0]= 3;
        A[1]=4;
        A[2]= 6;
        A[3]=1;
        A[4]= 33;
        A[5]=14;
        for( int x : A){
            System.out.print(x+ " ");
        }

        int insertingElement= 90;
        int insertingIndex=3;
        int temp=0;
        for(int i=6; i>insertingIndex; i--)
            A[i]=A[i-1];
        A[insertingIndex]=insertingElement;
        System.out.println();
        for( int x : A){
            System.out.print(x+ " ");
        }



         */

        //Deleting an element from an array

        int A[] = {34, 1, 7, 5, 45, 90, 78, 76, 65, 8, 7, 453, 23, 20, 99};
        for (int x : A) {
            System.out.print(x + " ");
        }
/*
        int deletingElement = 90;
        int deletingIndex;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == deletingElement) {
                A[i] = A[i + 1];
                deletingIndex = i;
                A[deletingIndex] = deletingElement;
                for (i = deletingIndex; i < A.length - 1; i++)
                    A[i] = A[i + 1];
                A[A.length-1]=0;

                System.out.println();
                for (int x : A)
                    System.out.print(x + " ");

            }
        }

         */

        //Copying an array
        /*
        int B[] = new int[A.length];
        for (int i = 0; i < A.length; i++)
            B[i] = A[i];

        System.out.println();
        for (int c: B )
            System.out.print( c+ " ");


         */


        //Reverse coping an array
        /*
        int B[] = new int[A.length];
        for (int i = 0; i<=A.length-1; i++)
            B[i] = A[A.length-1-i];

        System.out.println();
        for (int c: B )
            System.out.print( c+ " ");

         */


        //Increasing size of an array
        /*
        System.out.println();
        System.out.println("..............................................................." );
        int C[] = {34, 1, 7, 5, 45, 7, 453, 23, 20, 99};
        for (int x : C) {
            System.out.print(x + " ");
        }

        int B[] = new int[2*C.length];
        for (int i = 0; i<C.length; i++) {
            B[i] = C[i];
        }
        C=B;
        System.out.println();
        for (int c: B )
            System.out.print( c+ " ");

         */


         // Adding two matrix
        /*
        int C[][]={{2,5,1,7}, {7,5,9,3}, {9,3,6,2},{4,8,2,9}};
        int B[][]={{12,3,11,70}, {8,5,9,31}, {90,3,63,21},{41,8,23,39}};

        int D[][]= new int [4][4];
        for (int i=0; i < C.length; i++){
            for( int j=0; j<C[i].length; j++ ){
                D[i][j]=C[i][j]+ B[i][j];
            }
        }
        System.out.println();
        for(int x[]: D){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

         */

        //Multiplying two matrices
        /*
        int C[][]={{2,5,1,7}, {7,5,9,3}, {9,3,6,2},{4,8,2,9}};
        int B[][]={{1,0,0,0}, {0,1,0,0}, {0,0,1,0},{0,0,0,1}};

        int D[][]= new int [4][4];
        for (int i=0; i <4; i++){
            for( int j=0; j<4; j++ ){
                D[i][j]=0;
                for(int k=0; k<4; k++){
                    D[i][j]=D[i][j]+ C[i][k]*B[k][j];
                }

            }
        }
        System.out.println();
        for(int x[]: D){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

         */


        //Sorting strings
        String str[]={"alis", "grtgg","java", "csharp","python", "sql"};
        java.util.Arrays.sort(str);
        for(String s : str){
            System.out.println();
            System.out.print(s);
        }


    }}






