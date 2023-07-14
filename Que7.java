package PrePlacementTraning.DSA;

public class Que7 {
    public static void moveZeros(int[] nums) {
        int insertIndex = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        
        while (insertIndex < nums.length) {
            nums[insertIndex] = 0;
            insertIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
