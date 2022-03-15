import java.util.HashMap;
import java.util.HashSet;

public class Contain_Duplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(contain(nums));
    }
    private static boolean contain(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i =0; i< nums.length;i++)
        {
            if(numbers.contains(nums[i]))
                return  true;
            numbers.add(nums[i]);
        }
        return false;

    }
}
