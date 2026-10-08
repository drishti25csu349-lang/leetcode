class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> s = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(nums, ans, s, 0);

        return ans;
    }

    public void solve(int[] nums, List<List<Integer>> ans,
                      List<Integer> s, int i) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(s));
            return;
        }

        s.add(nums[i]);
        solve(nums, ans, s, i + 1);

        s.remove(s.size() - 1);

        solve(nums, ans, s, i + 1);
    }
}