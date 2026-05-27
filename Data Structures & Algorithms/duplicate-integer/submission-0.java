class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); 
        int max = nums[nums.length-1];
        int[] arr = new int[max+1];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1){
                return true;
            }
        }
        return false;
    }
}