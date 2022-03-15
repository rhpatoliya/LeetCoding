import java.util.Arrays;
import java.util.HashSet;

public class Intersections_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 4, 4, 3, 2, 3, 5};
        int[] nums2 = {1, 4, 6, 7, 8, 3, 9};
        int[] result = intersections(nums1,nums2);
        for(int i =0; i <result.length;i++){
            System.out.println(Arrays.toString(result));

        }
            }

    private static int[] intersections(int[] nums1, int[] nums2)
    {

        HashSet<Integer> set = new HashSet<>();
        for(int i: nums1)
        {
            set.add(i);
           // System.out.println(set);

        }
        HashSet<Integer> intersections = new HashSet<>();
        for(int i: nums2)
            if(set.contains(i))
            {
                intersections.add(i);
               //System.out.println(intersections);
            }
        int[] result = new int[intersections.size()];
            int index = 0;
            for(int i: intersections)

               // System.out.println(intersections);
                result[index++] = i;


        return result;
    }
}
