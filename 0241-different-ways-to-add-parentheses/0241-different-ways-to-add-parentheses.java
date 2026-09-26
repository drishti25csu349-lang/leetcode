class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List <Integer> result = new ArrayList<>();
        for(int i = 0 ;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*' ){
                String right = expression.substring(i+1);

                String left = expression.substring(0,i);
                List<Integer> leftresult = diffWaysToCompute(left);
                List<Integer> rightresult = diffWaysToCompute(right);

                for(int a : leftresult){
                    for(int b : rightresult){
                        if(c == '+'){
                            result.add(a+b);
                        }
                        else if(c == '-'){
                            result.add(a-b);
                        }
                        else{
                            result.add(a*b);
                        }
                    }
                }

            }
        }
        if(result.isEmpty()){
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}