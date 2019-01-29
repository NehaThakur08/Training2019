//Textual Representation of Customer Object
public class Customer {
	String name;
	String email;
	int phone_no;
	
	//Methods
	void setDataForCustomer(String n, String em, int ph){
		name = n;
		email = em;
		phone_no = ph;
		
	}
	
	void showDataForCustomer(){
		System.out.println("******CustmerData******");
		System.out.println("Name of Customer: "+name);
		System.out.println("Email of Customer: "+email);
		System.out.println("Contact of Customer: "+phone_no);
		System.out.println("--------------------");
		
		
	}
}
