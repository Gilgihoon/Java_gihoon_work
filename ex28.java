public class ex28 {
	public static void main(String[]args){
	int value = 356;
	System.out.println(value - (value % 100));
	System.out.println("--------------------------");
	System.out.println(value / 100*100);
	System.out.println("--------------------------");
	System.out.println((int) value/100*100);
	}
}