class Solution {
    List<List<Integer>>arr=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, 0, new ArrayList<>());
        return arr;
    }
    public void backtrack(int[] nums, int target, int start, List<Integer>curr){
        if(target==0){
            arr.add(new LinkedList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start; i<nums.length; i++){
            curr.add(nums[i]);
            backtrack(nums, target-nums[i], i, curr);
            curr.remove(curr.size()-1);
        }
    }
}
