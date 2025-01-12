# Trapping Rain Water Problem 🌧️

## Problem Statement  
Given an array of non-negative integers representing the height of bars in a histogram, determine how much water can be trapped after a rain.  

The bars form walls, and water is trapped between them. The challenge is to calculate the total amount of water trapped.  

---

### Input Format  
- An integer array `height[]` of size `n` where `height[i]` represents the height of the `i-th` bar.  

### Output Format  
- A single integer representing the total units of trapped water.  

---

### Example  

#### Example 1:  
**Input:**  
`height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}`  

**Visualization:**  
![Trapping Rain Water Example 1](https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png)  

**Output:**  
`6`  

**Explanation:**  
The water trapped in different segments is as follows:  
- Between indices 1 and 3, `1 unit` of water is trapped.  
- Between indices 3 and 7, `4 units` of water are trapped.  
- Between indices 8 and 10, `1 unit` of water is trapped.  

Total trapped water = `1 + 4 + 1 = 6`.  

---

## Approach  

### Intuition  
To solve the problem, the key is to calculate the amount of water trapped above each bar. The water trapped at any bar is determined by the **minimum height of the taller bars to the left and right** of the current bar, minus the height of the bar itself.

---

### Steps  

1. **Calculate Maximum Heights on the Left and Right:**  
   - Traverse the array from left to right to compute `left_max[i]` for every index `i`, where `left_max[i]` is the maximum height from the start up to index `i`.  
   - Similarly, traverse the array from right to left to compute `right_max[i]` for every index `i`, where `right_max[i]` is the maximum height from the end up to index `i`.  

2. **Compute Trapped Water for Each Bar:**  
   - For each index `i`, calculate the trapped water above the bar using the formula:  
     ``` 
     trapped_water[i] = min(left_max[i], right_max[i]) - height[i]
     ```  
   - If the result is negative, it means no water is trapped above that bar.  

3. **Sum Up the Results:**  
   - Add up the trapped water for all indices to get the total amount of water trapped.  

---

### Complexity Analysis  

1. **Time Complexity:**  
   - Calculating `left_max` and `right_max` takes `O(n)` time.  
   - Calculating the trapped water for each bar also takes `O(n)` time.  
   - Overall time complexity: **`O(n)`**.  

2. **Space Complexity:**  
   - Using two additional arrays, `left_max` and `right_max`, requires `O(n)` extra space.  
   - Overall space complexity: **`O(n)`**.  

---

### Visualization of Approach  

#### Step 1: Calculate `left_max` and `right_max`  
**For input:** `height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}`  

- `left_max[]` = `[0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]`  
- `right_max[]` = `[3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]`  

#### Step 2: Calculate Trapped Water  
For each index `i`:  
- Trapped water = `min(left_max[i], right_max[i]) - height[i]`  

Trapped water array: `[0, 0, 1, 0, 1, 2, 1, 0, 0, 1, 0, 0]`  

#### Step 3: Sum Up  
Total trapped water = `0 + 0 + 1 + 0 + 1 + 2 + 1 + 0 + 0 + 1 + 0 + 0 = 6`  
