import java.util.Arrays;
import java.util.EnumSet;

public class Contain_Duplicates_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       // int[] nums1 ={1,2,3,4,5,6};
        contains(nums);
        System.out.println("It does contain duplicates so its "+contains(nums));
       // contains(nums1);

    }

    private static boolean contains(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i]==nums[i +1])
                return true;
        }
        return false;
    }
}
