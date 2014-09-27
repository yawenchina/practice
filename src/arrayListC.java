import java.util.*;
public class arrayListC implements Comparator{
	
        public int compare(ArrayList<Integer> l1,ArrayList<Integer> l2){
            if(l1.get(0)+l1.get(1) < l2.get(0)+l2.get(1)){
                return -1;
            }else if (l1.get(0)+l1.get(1) == l2.get(0)+l2.get(1)){
                return 0;
            }else{
                return 1;
            }
        }

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
}
