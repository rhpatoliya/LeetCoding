import java.util.Arrays;
import java.util.HashSet;

public class FindSingle_Numbers_from_Duplicates_Arraylist {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 3, 4};
        singleNumber(nums);
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums)
    {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i : nums)
        {
            if (numbers.contains(i))
            {
                numbers.remove(i);
            } else
            {
                numbers.add(i);
            }

        }
        for (int i : numbers) {
            return i;

        }


        return 0;
    }
}