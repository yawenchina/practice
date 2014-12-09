public class Solution {
    
    public boolean wordBreak(String s, Set<String> dict) {
       boolean[] check = new boolean[s.length()+1];
       check[0] = true;
       for(int i = 1; i <= s.length(); i++){
           check[i] = false;
          for(int j = 0; j <= i ;j++){
              if(check[j] && dict.contains(s.substring(j, i))){
                  check[i]= true;
                  break;
              }
          }
       }
       return check[s.length()];
    }
}