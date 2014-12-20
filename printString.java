
public class printString {
	public static void main(String args[]){
		int n = 6;
		print(6);
	}
	public static void print(int n) {
		if(n <= 0){
			return ;
		}
		printHelper(new StringBuffer(), 0, n, 0);
	}
	public static void printHelper(StringBuffer bu , int index, int n, int size){
		if(index == n && size ==2){
			System.out.println(bu.toString());
			return;
		}else if(index == n){
			return ;
		}
		for(char a = 'a'; a <= 'z';a++){
			if(a == 'a' && size >= 2){
				continue;
			}
			bu.append(a);
			if(a == 'a'){
				printHelper(bu,index+1, n, size+1);
			}else{
			printHelper(bu,index+1, n, size);
			}
			bu.deleteCharAt(bu.length()-1);
		}
	}
}
