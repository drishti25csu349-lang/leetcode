class Solution {
    public int minimumPairRemoval(int[] nums) {
        int count  = 0 ;
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int n :nums){
            ans.add(n);
        }
        while(!isSorted(ans)){
 int index= -1;
 int sum = Integer.MAX_VALUE;
for(int i  =1;i<ans.size();i++ ){
    int check = ans.get(i)+ ans.get(i-1);
    if(check <sum){
        sum = check;
        index = i-1;
    }
}
if(index!=-1){
    ans.remove(index+1);
    ans.set(index,sum);
    count++;
}    
    }
    return count;
    }
    boolean isSorted(List<Integer> ans ){
        for(int i  = 1 ;i<ans.size();i++){
if(ans.get(i) < ans.get(i-1)){
    return false;
}
        }
        return true;
    }
}