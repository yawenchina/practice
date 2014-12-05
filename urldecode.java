
public class urldecode {
	public static void main(String args[]){
		String url = "dsfjaksldf sdfjaksldf dsfas dsfas  jk";
		System.out.print(urldecode(url));
	}
	public static String urldecode(String url){
		char[] array = url.toCharArray();
		int count = 0;
		for(char m : array){
			if(m == ' '){
				count++;
			}
		}
		char[] res = new char[url.length()+count*2];
		int i = url.length()-1;
		int j = res.length-1;
		while( i >= 0){
			if(array[i] == ' '){
				res[j] = '%';
				res[j-1] = '0';
				res[j-2] = '2';
				j -=3;
			}else{
				res[j--]=array[i];
			}
			i--;
		}
		return new String(res);
	}
	
}
