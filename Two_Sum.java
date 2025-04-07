public class Two_Sum {
    public int[] twoSum(int []nums,int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        int x = 20;
        int []arr = {8,3,12,17};
        Two_Sum s = new Two_Sum();

        System.out.println("here is the two sum of the array"+s.twoSum(arr,x));
    }
}
