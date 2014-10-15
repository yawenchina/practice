public class convert{
	public static  long StringToLong(String str) {
    if (str == null || str.length() == 0) {
        throw new NumberFormatException("Can not parse");
    }
    long result = 0;
    long isPositive = 1;
    int start = 0;
    if (str.charAt(0) == '-') {
        isPositive = -1;
        start = 1;
    }
    if (start == 1 && str.length() == 1) {
        throw new NumberFormatException("Can not parse");
    }
    for (; start < str.length(); start++) {
        char temp = str.charAt(start);
        int number = temp - '0';
        if (number < 0 || number > 9) {
            throw new NumberFormatException("Can not parse");
        }
        result = result * 10 * isPositive + number * isPositive;
    }
    return result;
}

public static void main(String args[]) 
{ 
long i = StringToLong("123"); 
if (i == 123) {
	System.out.print(i);
}
else {
	System.out.print("failture");
}
}
}
/*you must make sure that when you change the input of the string the char array, it must contains on the list,which is means that all of the char must be respond the the char number from 0-9.*/