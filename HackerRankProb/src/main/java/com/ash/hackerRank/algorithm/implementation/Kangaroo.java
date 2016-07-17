package com.ash.hackerRank.algorithm.implementation;

import java.util.Scanner;

/*There are two kangaroos on an x-axis ready to jump
 *  in the positive direction (i.e, toward positive infinity). 
 *  The first kangaroo starts at location and moves at a rate 
 *  of meters per jump. The second kangaroo starts at location 
 *  and moves at a rate of meters per jump. Given the starting 
 *  locations and movement rates for each kangaroo, can you
 *   determine if they'll ever land at the same location at 
 *   the same time?
 *   55 8223 5803 6509 NO 
*/

/**
 * Input Format

A single line of four space-separated integers 
denoting the respective values of , , , and .
 * @author amith2
 *
 *Print YES if they can land on the same location at the same time; 
 *otherwise, print NO.
 */
public class Kangaroo {

	/**
	 *  The two kangaroos must land at the same location after making the same number of jumps.
	 */
	
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String [] inputs=scanner.nextLine().split(" ");
		// x1 ,v1 ,x2 ,v2
		
		int x1=Integer.parseInt(inputs[0]);
		int v1=Integer.parseInt(inputs[1]);
		int x2=Integer.parseInt(inputs[2]);
		int v2=Integer.parseInt(inputs[3]);
		/**
		 * The modulus operator is the single-most important operator in Clock Arithmetic. It's generally used to check 
		 * if one number is evenly divisible by another. 
		 * If the result of a mod operation is 0, the dividend (number) is evenly divisible by the divisor.
		 * 
		 *  55 8223 5803 6509 
		 *  
		 */
		int dx= x1 - x2;
		int dv=v2-v1;
		if( x1 < x2 && v1 < v2 ){
			System.out.println("NO");
			System.exit(1);
		}
        else if(dv ==0 ){
            System.out.println("NO");
			System.exit(1);
        }
		else{
			if( dx %dv ==0 && dx *dv >0){
				// mod operator states that there is no reminder thus the dvivion gives whole number
				System.out.println("YES");
				System.exit(1);	
			}
			else{
				System.out.println("NO");
			}
        }
		
		
	}
}
