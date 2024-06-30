public class Sort {
    public static void main(String[] args) throws Exception {


        
        int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
        bubbleSort(arr);
         printArray(arr);


    }
     //Bubble sort
        public static void bubbleSort(int[] arr) {
           
           int temp=0;
           for(int i=0;i<arr.length-1;i++){
            for (int j=0; j<arr.length-1-i; j++){
                if ( arr[j]> arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        } 
           
          
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }

        
}

        //Selection sort
        public static void selectionSort(int[] arr) {
            int temp=0;
            for(int i=0;i<arr.length-1;i++){
                int min=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
      //Selection sort
        public static void insertionSort(int[] arr) {
            int temp=0;
            for(int i=1;i<arr.length;i++){
                int j=i-1;
                temp=arr[i];
                while(j>=0 && arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
            }
        }

    //insertion sort
    public static void insertionSort(){
        int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int temp=0;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
