# Maximum Water Between Two Bars 🚰

## Problem Statement  
Given an array of integers representing the height of bars, find the maximum amount of water that can be trapped between two bars. The amount of water trapped is determined by the shorter of the two bars, multiplied by the distance between them.

---

## Example  

### Example 1:  
**Input:**  
`nums = {2, 1, 8, 6, 4, 6, 5, 5}`  

**Output:**  
`24`  

**Explanation:**  
The maximum water is trapped between the bars at indices `2` and `5` (`nums[2] = 8` and `nums[5] = 6`), with a distance of `5 - 2 = 3`. Water trapped = `min(8, 6) * 3 = 24`.  

---

### Approach  

This problem is solved using the **two-pointer technique**, which efficiently calculates the maximum water that can be trapped between two bars.

### Steps  

1. **Initialize Two Pointers:**  
   - Use two pointers, `left` (starting at the beginning of the array) and `right` (starting at the end).  

2. **Calculate the Water Trapped:**  
   - Compute the trapped water for the current pair of bars using the formula:  
     ``` 
     temp = min(nums[left], nums[right]) * (right - left)
     ```  
   - Update the `result` with the maximum value obtained so far.  

3. **Move the Pointers:**  
   - Move the pointer pointing to the shorter bar inward to explore other possibilities.  

4. **Return the Result:**  
   - Once the pointers meet, the computation is complete, and the result contains the maximum water trapped.  
