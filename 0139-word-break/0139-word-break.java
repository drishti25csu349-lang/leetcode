class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length() + 1];
        Set<String> wordSet = new HashSet<>(wordDict);

        return check(s, wordSet, dp, 0);
    }

    private boolean check(String s, Set<String> wordSet,
                          Boolean[] dp, int index) {

        if (index == s.length()) {
            return true;
        }

        if (dp[index] != null) {
            return dp[index];
        }

        for (int i = index + 1; i <= s.length(); i++) {
            String temp = s.substring(index, i);

            if (wordSet.contains(temp)) {
                if (check(s, wordSet, dp, i)) {
                    return dp[index] = true;
                }
            }
        }

        return dp[index] = false;
    }
}