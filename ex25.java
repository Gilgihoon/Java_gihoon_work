public class ex25 {
	public static void main (String[]args){
		int charCode = 'A';
	
		if((charCode>=65) & (charCode<=90)){
		System.out.println("Big Font");
		}
	
		if((charCode>=97) && (charCode<=122)){
		System.out.println("Small Font");
		}
		if((charCode<48) && (charCode>57)){
		System.out.println("NUM");
		}

		int value = 6;

		if ((value%2==0) | (value%3==0)){
		System.out.println("2 or 3");
		}
	
		if ((value%2==0) || (value%3==0)){
		System.out.println("2 or 3");
		}
	}
}