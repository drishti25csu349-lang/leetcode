class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        Boolean[] dp = new Boolean[s.length() + 1];
        return check(s, wordDict, result, 0, dp);
    }

    private boolean check(String s, List<String> wordDict,
                          List<String> result, int index, Boolean[] dp) {
        Set<String> wordSet = new HashSet<>(wordDict);

        if (index == s.length()) {
            return true;
        }

        if (dp[index] != null) {
            return dp[index];
        }

        for (int i = index + 1; i <= s.length(); i++) {
            String temp = s.substring(index, i);

            if (wordSet.contains(temp)) {
                if (check(s, wordDict, result, i, dp)) {
                    return dp[index] = true;
                }
            }
        }

        return dp[index] = false;
    }
}