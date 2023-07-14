package DSA.Assignment;

import java.util.HashSet;

public class Que8 {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();

        int duplicate = -1;
        int sum = 0;
        int expectedSum = nums.length * (nums.length + 1) / 2;

        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
                sum += num;
            }
        }

        int missing = expectedSum - sum;
        result[0] = duplicate;
        result[1] = missing;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println(result[0] + " " + result[1]);
    }
}
