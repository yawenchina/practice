public static void main(String args[]){
	System.out.print(check(String m, String n));




}
public static boolean check(String m , String n){
	int i = 0;
	int j = 0;
	if(m.length() < n.length()){
		check(n, m);
	}
	while(i < m.length() && j < n.length()){
		if(m.charAt(i) == n.charAt(j)){
			i++;
			j++;
		}else{
			i++;
		}
	}
	if(j == n.length()){
		return true;
	}
	return false;




}