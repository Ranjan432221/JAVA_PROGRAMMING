public class Binary_Search {
    public static int Binary(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                result = mid;
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 5, 6,56, };
        int a = 4;
        int result = Binary(arr, a);

        System.out.println("the position of the searching element is = " + result);
    }
}
