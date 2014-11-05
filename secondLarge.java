/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	public static void main(String args[]){
	int[] m = {1,2,3,1,4,5,3};
	int[] m1 = {1,2};
	int[] array = {1,1};
	int[] array1 = {1};
	find(m);
	find(m1);
	find(array);
	find(array1);
	}
	public static void find(int[] array){
		int max = Integer.MIN_VALUE;
		int ma = Integer.MIN_VALUE;
		for (int i : array){
			if(i > max){
				ma = max;
				max = i;
			}else if(i > ma){
				ma = i;
			}
		}
		System.out.println(max);
		System.out.println(ma);
	}
	
}
