class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] op = new int [2*n];

        for(int i = 0; i < n ; i++){
            op[i]= op[i+n] = nums[i];

        }
        return op;
    }
}