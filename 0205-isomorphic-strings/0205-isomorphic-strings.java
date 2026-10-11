class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;

        }
        HashMap<Character,Character> check1 = new HashMap<>();
        HashMap<Character,Character> check2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char a  = s.charAt(i);
            char b = t.charAt(i);
            if(check1.containsKey(a)){
                if(check1.get(a) != b){
                    return false;
                }
            }
            if(check2.containsKey(b)){
                if(check2.get(b) != a){
                    return false;
                }
            }
            check1.put(a,b);
            check2.put(b,a);

        }
        return true;
    }
}