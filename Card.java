//Textual Representation of Card Object
public class Card {
String type;
int cvv;
String expiry;
Customer cRef;
//Methods
	void setDataForCard(String ty , int c , String exp){
		type = ty;
		cvv = c;
		expiry = exp;
		
	}
	
	void showDataForCard(){
		System.out.println("******CardData******");
		System.out.println("Type of Card: "+type);
		System.out.println("CVV of Card: "+cvv);
		System.out.println("Expiry Date of Card: "+expiry);
		System.out.println("-------------------------");
		
	}
}
