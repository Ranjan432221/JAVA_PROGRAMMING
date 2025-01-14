public class Largest_method2 {
    void thirdLargest(int[] arr, int arr_size) {
        if(arr_size < 3) {
            System.out.println("the size of the array is 3 or invalid");
            return ;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        
       for(int i=0; i < arr_size; i++) {
        if(firstLargest < arr[i]) {
            thirdLargest = secondLargest;
            secondLargest = firstLargest;
            firstLargest = arr[i];
        } else if(secondLargest < arr[i] && firstLargest != arr[i]) {
            thirdLargest = secondLargest;
            secondLargest = arr[i];
        } else if(thirdLargest < arr[i] && secondLargest != arr[i] && firstLargest != arr[i]) {
            thirdLargest = arr[i];
        }
       }

       System.out.println("first largest = "+firstLargest);
       System.out.println("second largest = "+secondLargest);
       System.out.println("third largest  = "+thirdLargest);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int n = arr.length;

        Largest_method2 l = new Largest_method2();
        l.thirdLargest(arr, n);
    }
}
