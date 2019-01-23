
public class Methods {
static void multiplynum(int x,int y){ //static method
	 int z= x * y;
	 System.out.println("Result of multiplication is:"+z);
 }
void multiplynum2(int x,int y){ // non static method
	 int z= x * y;
	 System.out.println("Result of multiplication is:"+z);
}
 
	public static void main(String[] args) {
		int a=10;
		int b=4;
		int c=a*b;
		System.out.println("The value of c:"+c);
		Methods.multiplynum(20,30); //execution of static method
		System.out.println("");
		Methods multiref=new Methods(); //execution of non static method
		multiref.multiplynum(20,3);
		multiref.multiplynum(10,10);
	}

}
