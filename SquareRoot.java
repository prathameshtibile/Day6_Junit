/**
 * @author PRATHAMESH TIBILE
 * @since 18-6-21
 */
package Day6_JunitTesting;
import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) 
	{
		
			Scanner s = new Scanner(System.in);
			System.out.println("enter no to find square root");
			double c = s.nextDouble();
			System.out.println("square root is " + Util.sqrt(c));
			s.close();
		
			
	}

	}


