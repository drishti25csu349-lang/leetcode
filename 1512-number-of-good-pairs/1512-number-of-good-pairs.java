
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int count = 0;

     for (int i = 0; i < nums.length; i++) {
    int num = nums[i];

    count += freq[num];
    freq[num]++;
}
        return count;
    }
}