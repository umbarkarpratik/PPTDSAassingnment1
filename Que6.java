package PrePlacementTraning.DSA;

import java.util.HashSet;

public class Que6 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hp = new HashSet<>();
        for (int num : nums) {
            if (hp.contains(num)) {
                return true;
            }
            hp.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
