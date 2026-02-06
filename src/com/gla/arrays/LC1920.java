package com.gla.arrays;
class Solution {
    public int[] buildArray(int[] nums) {
        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int idx = nums[i];
            int value = nums[idx];
            ans[i] = value;

        }
        return ans;
    }

    static void main() {

    }
}
