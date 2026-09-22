class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int check = 0 ;
      List<Boolean> ans = new ArrayList<>();
      outer:
        for(int i = 0 ;i<candies.length;i++){
int sum = 0 ;
sum +=candies[i];
sum+=extraCandies;
for(int j = 0;j<candies.length;j++){
    if(sum<candies[j]){
        ans.add(false);
        continue outer;
    }
}
        ans.add(true);

        }
        return ans ;
    }
}