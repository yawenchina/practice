import java.util.*;
public class blackJack {
		public static void main(String args[]){
			Card a = new Card();
			a.m = 1;
			Card b = new Card();
			b.m = 2;
			Card c = new Card();
			c.m = 5;
			ArrayList<Card> array = new ArrayList<Card>();
			array.add(a);
			array.add(b);
			array.add(c);
			getScore(array);
			
		}
		public static void getScore(ArrayList<Card> array){
			ArrayList<Card> used = new ArrayList<Card>();
			StringBuffer bf = new StringBuffer();
			scoreHelper(array, used,0,bf);
		
		}
		public static void scoreHelper(ArrayList<Card> array, ArrayList<Card> used, int number,StringBuffer path){
			if(array.size() == used.size() && number == 21){
				SyStem.out.print(path.toString());
				return;
			}
			if(array.size() == used.size()){
				return ;
			}
			for(Card one : array){
				if(!used.contains(one)){
					if(one.m == 1){
						used.add(one);
						path.append('*').append(one.m);
						scoreHelper(array, used, newnum, path);
						path.remove(path.length()-1);
						path.remove(path.length()-1);
						path.append('+').append(one.m);
						scoreHelper(array, used, newnum+1, path);
						path.remove(path.length()-1);
						path.remove(path.length()-1);
						path.append('*').append(11);
						scoreHelper(array, used, newnum*11, path);
						path.remove(path.length()-1);
						path.remove(path.length()-1);
						path.append('+').append(11);
						scoreHelper(array, used, newnum+11, path);
						path.remove(path.length()-1);
						path.remove(path.length()-1);

					}else{
						used.add(one);
						path.append('*').append(one.m);
						scoreHelper(array, used, newnum*one.m, path);
						path.remove(path.length()-1);
						path.remove(path.length()-1);
						path.append('+').append(one.m);
						scoreHelper(array, used, newnum+one.m, path);
						path.remove(path.length()-1);
						path.remove(path.length()-1);
					}
				}
			}
		}
	
		  
		


}
