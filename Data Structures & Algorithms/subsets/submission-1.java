class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>>res=new ArrayList<>();
       backtrack(0, nums, new ArrayList<>(), res);
       return res;
    }
    public void backtrack(int index, int[] nums, List<Integer>arr, List<List<Integer>>res){
        res.add(new ArrayList<>(arr));
        for(int i=index; i<nums.length; i++){
            arr.add(nums[i]);
            backtrack(i+1, nums, arr, res);
            arr.remove(arr.size()-1);
        }
    }
}
