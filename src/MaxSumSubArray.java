public class MaxSumSubArray {
    public int maxSubArray(int[] nums) {
        int ret = nums[0], sum = 0;
        for(int num : nums) {
            if(sum > 0) {
                sum += num;
            }else {
                sum = num;
            }
            ret = Math.max(ret, sum);
        }
        return ret;
    }
}
