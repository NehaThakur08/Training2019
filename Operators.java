package operations;

public class Operators {

	public static void main(String[] args) {
		int x=20;
		int y=8;
		int z=x++;
		int a= x|y;
		int b=y>>2;
		y=y+2;
		//Arithmetic Operators
		System.out.println("Result of Addition is:"+(x+y));
		System.out.println("Result of Subtarction is:"+(x-y));
		System.out.println("Result of Multiplication is:"+(x*y));
		System.out.println("Result of Division is:"+(x/y));
		System.out.println("Result of Modulus is:"+(x%y));
		System.out.println();
		//Unary Operators
		System.out.println();
		System.out.println("Value of x for unary operator is:"+x);
		System.out.println("Value of z for unary operator is:"+z);
		//Assignment Operators
		System.out.println();
		System.out.println("Value of y for assignment operator is:"+y);
		//Bitwise Operators
		System.out.println();
		System.out.println("Value of a for bitwise operator is:"+a);
		//Shift Operators
		System.out.println();
		System.out.println("Value of b for shift right is:"+b);
		
	}

}
