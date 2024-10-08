class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums1) list.add(i);
        for(int i:nums2) list.add(i);   
        Collections.sort(list); 
        int size = list.size();
        
        return (double)(list.get((size-1)/2) + list.get(size/2))/2;       
    }
}