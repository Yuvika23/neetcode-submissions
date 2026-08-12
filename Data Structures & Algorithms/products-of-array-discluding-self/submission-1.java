class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int left=1;
        for(int i=0; i<nums.length; i++){
            arr[i]=left;
            left=left*nums[i];
        }
        int right=1;
        for(int i=n-1; i>=0; i--){
            arr[i]=arr[i]*right;
            right=right*nums[i];
        }
        return arr;
    }
}  
