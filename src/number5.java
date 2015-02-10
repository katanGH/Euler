
public class number5 {
	public static void main(String [] args){
		int num = 2520; // Initialized as 2520 is divisible from 1-10
		boolean gotNumber = false; // Will use as a way to tell if number has been found
	    while (gotNumber == false) {
	        num = num + 2520; // Add 2520 because the answer should be a multiple of 2520 as 2520 is divisible from 1-10
	        boolean divisible = true; // Will use as a way to tell if its divisible. The first time it's not divisible by a numbe it will move to fals.
	        for ( int i = 11; i <= 20; i++ ) {
	            if (num % i != 0) { // If the number is not divisible by i, which will be numbers 11-20, it will become false.
	                divisible = false;
	            }
	        }
	        if (divisible == true) {
	            gotNumber = true; // Number has been found so we can stop the loop and print out the number!
	            System.out.println(num);
	        }
	    }
	}
}
		
	
