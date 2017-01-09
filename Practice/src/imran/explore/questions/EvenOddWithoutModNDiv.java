/* find out even and odd number without using %(modulas) and /(division) operator.
logic to be implemented in our program  if "Number & 1==0" then its even number. */

package imran.explore.questions;

import java.util.Scanner;

public class EvenOddWithoutModNDiv {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num= in.nextInt();
		if((num & 1) == 0)
			System.out.println("Number is even!");
		else
			System.out.println("Number is odd!");
	in.close();
	}
}
