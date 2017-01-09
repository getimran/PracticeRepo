package imran.explore.questions;

import java.util.Scanner;

public class ReverseString {

	public String recursiveReverse (String str) {
		if(str.length()<2){
			return str;
		}
		return recursiveReverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str= in.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse String using inbuilt method: "+sb.reverse());
		
		char strChar[]= str.toCharArray();
		System.out.print("Reverse String using for loop: ");
		for(int i=strChar.length-1;i>=0;i--){
			System.out.print(strChar[i]);
		}
		System.out.println();
		ReverseString obj= new ReverseString();
		System.out.println("Reverse String using recursive method: "+obj.recursiveReverse(str));
		in.close();
	}

}
