import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5,6,7};
        rotate(nums,3);
            System.out.println(Arrays.toString(nums));
            //here output is [7,6,5,4,3,1]
        }

    public static void rotate(int[] nums, int d){
        d= d % nums.length;

        reverse(nums, 0,nums.length-1);
       // reverse(nums,0,d-1);
        //here output is [7,6,5,4,3,1]
        reverse(nums,0,d-1);
        //here output is [5,6,7,4,3,2,1]
        reverse(nums,d, nums.length-1);
        //here output is [5,6,7,1,2,3,4]

    }

    private static void reverse(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}