/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String input = "This is test to reverse the string";	
		System.out.print(reverseSub(input, "", "", 0));	
		//System.out.print(reverIt(input, "", input.length()-1));	
	}
	
	
	private static String reverseSub(String in, String out, String chunk, int index){
		
		return index<in.length() ? in.charAt(index) == ' ' || index == in.length()-1 ? reverseSub(in,  out+reverIt(chunk, "", chunk.length()-1)+" ",  "", ++index) : reverseSub (in, out, chunk + in.charAt(index), ++index) : out;
	}
	
	private static String reverIt(String in, String out, int index){
		
		return index>=0 ? reverIt(in, out+in.charAt(index), --index) : out;
	}
}
