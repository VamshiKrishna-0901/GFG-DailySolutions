public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 1, 0, 4};

        Solution solution = new Solution();
        int result = solution.maxWater(nums);
        System.out.println(result);
    }
}


class Solution {
    public int maxWater(int[] nums) {
        int length = nums.length;

        int[] left = maxFromLeft(nums, nums.length);
        int[] right = maxFromRight(nums, nums.length);

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += Math.min(left[i], right[i]) - nums[i];
        }
        return result;
    }

    private int[] maxFromRight(int[] nums, int length) {
        int[] right = new int[length];
        right[length - 1] = nums[length - 1];

        for (int i = length - 2; 0 <= i; i--) {
            right[i] = Math.max(right[i + 1], nums[i]);
        }
        return right;
    }

    private int[] maxFromLeft(int[] nums, int length) {
        int[] left = new int[length];
        left[0] = nums[0];

        for (int i = 1; i < length; i++) {
            left[i] = Math.max(left[i - 1], nums[i]);
        }
        return left;
    }
}