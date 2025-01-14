class Solution {
    public static int findEquilibrium(int[] nums) {
        int[] sumFromLeft = new int[nums.length];
        addFromLeft(nums, sumFromLeft);

        int[] sumFromRight = new int[nums.length];
        addFromRight(nums, sumFromRight);

        for (int i = 1; i < nums.length - 1; i++) {
            if (sumFromLeft[i - 1] == sumFromRight[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    private static void addFromRight(int[] nums, int[] sumFromRight) {
        sumFromRight[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; 0 <= i; i--) {
            sumFromRight[i] = sumFromRight[i + 1] + nums[i];
        }
    }

    private static void addFromLeft(int[] nums, int[] sumFromLeft) {
        sumFromLeft[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumFromLeft[i] = sumFromLeft[i - 1] + nums[i];
        }
    }


}