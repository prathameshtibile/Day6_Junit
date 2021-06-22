/**
 * @author PRATHAMESH TIBILE
 * calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine :
 */

package Day6_JunitTesting;

import java.util.Scanner;

public class VendingMachine 
{
	//static variable I is declared to change notes and Static variable TOTAL is
   //declared to count total notes
	  static int I, TOTAL;
	  
	  
	  //Static array to store values of notes
	  static int[] NOTES = { 1 , 2 , 5 , 10 , 50 , 100 , 500 , 1000 };
	  
	  static void notes(int value)
	  {
			if (value / NOTES[I] != 0)
			{
				TOTAL += (value / NOTES[I]);
				System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
				value = value % NOTES[I];
			}
			I++;
			if (value == 0) 
			{
				System.out.println("total notes :" + TOTAL);
				return;
			}

			notes(value);

	}
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter amoumt");
	int value = s.nextInt();
	notes(value);
	s.close();
}

}
