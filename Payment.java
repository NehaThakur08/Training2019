//Application Class->Execution
public class Payment {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Card ca1 = new Card();
		System.out.println("Value of Customer: " +c1);
		System.out.println("Value of Card: " +ca1);
		
	
		c1.setDataForCustomer("Karan", "karan@gmail.com",  97439943);
		ca1.setDataForCard("Credit", 324, "jul/2022");
		ca1.cRef = c1;
		c1.showDataForCustomer();
		ca1.showDataForCard();
		int[] arr = new int[5];
		arr[0] = 111;

		// cArr is a Ref Variable
		// it will point to customer reference variable array in Heap will all ref variables of customer as null
		Customer[] cArr = new Customer[5];

		cArr[0] = new Customer();

		cArr[2] = new Customer();

		cArr[0].setDataForCustomer("Jass", "j@gmail.com", 9887652);
		//cArr[1].setDataForCustomer("Nyra", "nyra@gmail.com", 98642q); //  -> Error at Runtime
		cArr[2].setDataForCustomer("Preet", "preet@gmail.com", 876432);

		cArr[0].showDataForCustomer();
		//cArr[1].showDataForCustomer(); // -> Error at Runtime
		cArr[2].showDataForCustomer();



	}

		
	}


