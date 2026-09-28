class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        // Convert string to character array for easy modification
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] chars, int index, List<String> result) {
        // BASE CASE: If we reached the end of the string, record the word
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        // IF IT'S A LETTER: Explore both lowercase and uppercase branches
        if (Character.isLetter(chars[index])) {
            // Choice 1: Make it lowercase
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index + 1, result);

            // Choice 2: Make it uppercase
            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
        } 
        // IF IT'S A DIGIT: Just move to the next index
        else {
            backtrack(chars, index + 1, result);
        }
    }
}