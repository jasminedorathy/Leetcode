 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Append elements from nums2 into nums1 starting at index m
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        // Sort the combined array
        Arrays.sort(nums1);
    }
}