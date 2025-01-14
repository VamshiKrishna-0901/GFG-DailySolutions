# Equilibrium Point

---

## Problem Statement

Given an array of integers arr[], the task is to find the first **equilibrium point** in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

---

## Example 

**Input:**
`nums = [1, 2, 0, 3]`

**Output:**
2

**Explanation**
The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 os 0 + 3 = 3.

---

**Input:**
nums = [1,1,1,1]

**Output:**
-1

**Explanation:**
There is no equilibrium index in the array.

----

## Approach  

The problem is solved by calculating the cumulative sums of the array from both the left and right sides and comparing them at each index.

### Steps  

1. **Compute Left Cumulative Sums:**  
   - Create an array `sumFromLeft` where each element at index `i` stores the cumulative sum of elements from the start of the array up to index `i`.  

2. **Compute Right Cumulative Sums:**  
   - Create an array `sumFromRight` where each element at index `i` stores the cumulative sum of elements from the end of the array up to index `i`.  

3. **Check for Equilibrium Index:**  
   - Iterate through the array from the second to the second-last index.  
   - For each index `i`, check if `sumFromLeft[i-1] == sumFromRight[i+1]`. If true, return `i` as the equilibrium index.  

4. **Return Result:**  
   - If no equilibrium index is found, return `-1`. 