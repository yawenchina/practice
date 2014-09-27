


import java.util.*;
public class compareArray {

     public static void main(String []args){
        int[] a = {1,2,3,4,5,6,7,7,8};
        int[] b ={2,3,4,5,6,7};
        ArrayList<ArrayList<Integer>> result = findk(a ,b,5);
        for(int i = 0 ;i < result.size() ;i++){
            System.out.println(result.get(i).get(0));
            System.out.println(result.get(i).get(1));
            System.out.println("thsi is ");
        }
     }
     public static  ArrayList<ArrayList<Integer>> findk(int[] a,int[] b,int k){
         HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
         ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
         PriorityQueue<ArrayList<Integer>> p = new PriorityQueue<ArrayList<Integer>>(2*k,new arrayListC());
         int i = 0;
         int j = 0;
         
         for(;i < k ;i++){
        	 for(;j < k;j++){
        	 ArrayList<Integer> index = new ArrayList<Integer>();
             index.add(a[i]);
             index.add(b[j]);
             if(!map.containsKey(a[i]+b[j])){
             map.put(a[i]+b[j],true);
             p.add(index);
             }
             
        	 }
         }
         for(int m = 0; m < k;m++){
        	 ArrayList<Integer> temp = p.poll();
        	 result.add(temp);
         }
         return result;
     }
}


