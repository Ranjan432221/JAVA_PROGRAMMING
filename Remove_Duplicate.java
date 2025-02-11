public class Remove_Duplicate {

    public static int removeDuplicate(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int x = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[x]) {
                x = x + 1;
                arr[x] = arr[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] ar = {5,5,6,6,7,7,7,8,8,9,10};
        int newAr = removeDuplicate(ar);

        for(int i = 0; i < newAr; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
