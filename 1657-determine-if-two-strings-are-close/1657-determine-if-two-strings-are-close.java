class Solution {
    public boolean closeStrings(String word1, String word2) {
     int [] freq1 = new int[26];
     for(int i = 0 ;i<word1.length();i++){
        freq1[word1.charAt(i) -'a']++;
     }
          int [] freq2 = new int[26];
   
     for (int  j = 0 ;j<word2.length();j++){
freq2[word2.charAt(j) -'a']++;
     }
     for(int i = 0 ;i<26;i++){
        if(freq1[i]==0 && freq2[i] !=0 || (freq1[i]!=0 && freq2[i]==0)){
            return false;
        }
     }
     Arrays.sort(freq1);
     Arrays.sort(freq2);
     for(int i = 0;i<26;i++){
        if(freq1[i] != freq2[i])
        return false;
     }
    return true;

    }
}