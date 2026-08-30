class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }
    public void backtrack(int[] nums, List<Integer>arr, List<List<Integer>>res){
        if(arr.size()==nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(arr.contains(nums[i])){
                continue;
            }
            arr.add(nums[i]);
            backtrack(nums, arr, res);
            arr.remove(arr.size()-1);
        }
    }
}
