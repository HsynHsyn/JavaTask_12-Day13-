package Day13_Methods;

public class CreditCardMethod {

	public static void main(String[] args) {
		
		double salary = 50000;
		int creditRating=5;
		
		if (salary>= 20000 && creditRating>=7) {
			qualify();
			
		}else {
			noqualify();
			
		}
							
	}

	public static void noqualify() {
		System.out.println("I am sorry you are not qualify for the CC");
	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC");
		
	}
	

	
}


