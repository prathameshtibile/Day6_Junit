 /**
 * @author PRATHAMESH TIBILE
 * @since 18-6-21
 */

package Day6_JunitTesting;

public class Util {
    
		
	   // Method to find Day Of Week
		static int dayOfWeek(int d, int m, int y) {
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}
		
		
		//  Method for Temprature conversion
		static int temperaturConversion(int tem, char t) {
			int conver;
			if (t == 'c' || t == 'C') {
				conver = (tem * 9 / 5) + 32;
			} else if (t == 'f' || t == 'F') {
				conver = (tem - 32) * 5 / 9;
			} else {
				System.out.println("Enter correct input");
				return 0;

			}
			return conver;
		}
		
		// Method to find monthly payment
		static double monthlyPayment(double p, double y, double r) {
			double n = 12 * y;
			double r0 = r / (12 * 100);
			double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
			return payment;
		}
		
		
		//Method to find the square root of given no
		static double sqrt(double c) {

			double t = c;
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > epsilon * t) {
				t = (c / t + t) / 2;
			}

			return t;
		}
		
	
		

		
}
