class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, "", result);
        return result;
    }

    private void backtrack(String s, int index, String current, List<String> result) {
        // BASE CASE: If current built string matches original length, add it
        if (index == s.length()) {
            result.add(current);
            return;
        }

        char ch = s.charAt(index);

        // IF IT'S A LETTER: Branch into lowercase and uppercase
        if (Character.isLetter(ch)) {
            // Choice 1: Add lowercase version to candidate string
            backtrack(s, index + 1, current + Character.toLowerCase(ch), result);

            // Choice 2: Add uppercase version to candidate string
            backtrack(s, index + 1, current + Character.toUpperCase(ch), result);
        } 
        // IF IT'S A DIGIT: Append character as is
        else {
            backtrack(s, index + 1, current + ch, result);
        }
    }
}