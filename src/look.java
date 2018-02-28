import java.util.Scanner;

public class look {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter A Word");
		String text = scan.nextLine();
System.out.println(SecondtoLast(text));
	
			}
public static String SecondtoLast (String word){
	char first = word.charAt(0);
	int index = word.length()-2;
	char AlmostLast = word.charAt(index);
	String firstAlmost= first+ "   " + AlmostLast;
		return firstAlmost;
}
		
	}


