package pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		for(int i=1;i<=5;i++){
			for(int j=1;j<i+1;j++){
				x=i+j-2;
				if(x==0){
					System.out.print("1");
				}else{
					System.out.print(""+x);
				}
				
			}
			System.out.println("");
		}
	}

}
