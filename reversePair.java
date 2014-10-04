import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int[] array1 ={314-1-10};
        print(array1);
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> nn = new ArrayList<Integer>();
        int start = 0;
        int next = -1;
        boolean found = false;
        for(int m = start; m < array1.length-1; m++){
            for(int n = start+1 ; n < array1.length ;n++ ){
                if(array1[m] > array1[n]){
                    nn.clear();
                    nn.add(array1[m]);
                    nn.add(array1[n]);
                    //System.out.print(m);
                     //System.out.print(n);
                      System.out.println("");
                    result.add(new ArrayList<Integer>(n));
                }else if(!found){
                    next = n;
                    found = true;
                }
            }
            if(found){
                start = next;
            }
        }

     }
     public static void print(int[] array){
         for(int m : array){
             System.out.print(m);
         }
     }
}


