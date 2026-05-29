class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLen = nums.length;
        int ansLen = 2 * nums.length;
        int[] ans = new int[ansLen];
        for(int x=0; x<numsLen; x++){
            ans[x] = nums[x];
            ans[numsLen + x] = nums[x];
        }
        return ans;
    }
}