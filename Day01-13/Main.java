public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 8, 6, 4, 6, 5, 5};

        Solution solution = new Solution();
        int result = solution.maxWater(nums);
        System.out.println(result);
    }
}

class Solution {
    public int maxWater(int[] nums) {
        int result = 0;

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = Math.min(nums[left], nums[right]) * (right - left);
            result = Math.max(result, temp);
            if (nums[left] <= nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
