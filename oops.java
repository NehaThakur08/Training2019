class Cab{
	String driver;
	String colour;
	String reg_no;
	String model;
}
public class oops {

	public static void main(String[] args) {
		Cab cRef1 = new Cab();
		Cab cRef2 = cRef1;//Refernce Copy
		System.out.println("The value of cRef1 is:"+cRef1);
		System.out.println("");
		System.out.println("The value of cRef2 is:"+cRef2);
		cRef1.driver = "Ahyan";
		cRef1.colour = "Black";
		cRef1.reg_no = "PB10F2019";
		cRef1.model = "Hyundai_i20";
		cRef2.reg_no = "PB10F2000"; //update
		System.out.println("");
		System.out.println("Driver " +cRef1.driver+" has "+cRef1.model);
		System.out.println("");
		System.out.println(cRef1.model+ " has "+cRef1.reg_no+" registration number"); 
		System.out.println("");
		System.out.println("The updated reg no of  " +cRef2.model+ " is "+cRef2.reg_no); 
		
	}
}