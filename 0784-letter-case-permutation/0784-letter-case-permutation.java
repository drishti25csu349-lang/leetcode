class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        check(result,"",0,s);
        return result;
    }
    public void check(List<String> result,String curr,int index,String s ){
        if(index == s.length()){
            result.add(curr);
            return ;
        }
        char  ch = s.charAt(index);
         if(Character.isLetter(ch)){
            check(result,curr + Character.toLowerCase(ch),index+1,s);
            check(result,curr + Character.toUpperCase(ch),index+1,s);
            
        }
        else {
            check(result,curr+ch,index+1,s);
  
        }
    }
}