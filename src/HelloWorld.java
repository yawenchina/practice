
import java.util.*;
import java.util.Comparator;
public class HelloWorld{

     public static void main(String []args){
        int[] a = {1,2,3,4,5,6,7,7,8};
        int[] b ={2,3,4,5,6,7};
        ArrayList<Integer> result = findk(a ,b,5);
        for(int i = 0 ;i < 5 ;i++){
            System.out.print(result.get(i));
        }
     }
     public static  ArrayList<Integer> findk(int[] a,int[] b,int k){
         HashMap<ArrayList<Integer>,Boolean> map = new HashMap<ArrayList<Integer>,Boolean>();
         ArrayList<Integer> result = new ArrayList<Integer>();
         PriorityQueue<ArrayList<Integer>> p = new PriorityQueue<ArrayList<Integer>>();
         Collections.sort(p,new arrayListC());
         int i = 0;
         int j = 0;
         ArrayList<Integer> index = new ArrayList<Integer>();
         index.add(a[0]);
         index.add(b[0]);
         p.add(index);
         while(i < k){
             ArrayList<Integer> temp = p.poll();
             result.add(a[temp.get(0)],b[temp.get(1)]);
             index.clear();
             int x = temp.get(0);
             int y = temp.get(1);
             index.add(x);
             index.add(y+1);
             if(y+1 < b.length && !map.containsKey(index)){
                 map.put(index,true);
                 p.add(index);
             }
             index.clear();
            
             index.add(x+1);
             index.add(y);
             if(x+1 < b.length && !map.containsKey(index)){
                 map.put(index,true);
                 p.add(index);
             }
             i++;
         }
         return result;
     }
}
