public class AnotherDistinct {
    public static void main(String args[]) {
        int []arr = {1,1,2,23,3,3,4,4,5,5,6,6,7,7,8,8};
       System.out.print(arr[0]+" ");

       for(int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i-1]) {
            System.out.print(arr[i]+" ");
        }
       }
    }
}
