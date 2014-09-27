import java.util.*;
public class changeURL {
	 public static void main(String []args){
         String m = "I love yahoo ";
         char[] mm = m.toCharArray();
         mm = swap(mm);
        for(int i = 0 ;i < mm.length ;i++){
            System.out.print(mm[i]);
            System.out.print("fdskfja");
        }
     }
     public static char[] swap(char[] mm){
         int i = 0;
         int j = mm.length-1;
         while(i <= j){
             while(mm[i] != ' '){
                 i++;
             }
             while(mm[j] != ' '){
                 j--;
             }
             char temp = mm[i];
             mm[i] = mm[j];
             mm[j] = temp;
         }
         return mm;
     }
}
