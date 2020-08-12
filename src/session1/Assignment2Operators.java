package session1;
//Exploring shift operators in negative numbers
//Signed right shift moves all the bits by given number of positions to the right. However, it preserves the sign. Positive numbers remain positive and negative ones remain negative. Similar to left shift,
//the right shift of n positions is equivalent to division by 2^n. Or division by 2^n -1 in case of odd numbers.
//Unlike the signed shift, the unsigned one does not take sign bits into consideration, it just shifts all the bits to the 
//right and pads the result with zeros from the left. That means that for negative numbers, the result is always positive. Signed and unsigned right shifts have the same result for positive numbers.

public class Assignment2Operators {

	public static void main(String[] args) {
		int a=-1;
		System.out.println(a<<2);//4
		System.out.println(a>>2);//1
		System.out.println(a>>>3);
		int b=2;
		System.out.println(b>>>2);//0

	}

}
