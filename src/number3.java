
public class number3 {
	 public static void main(String[] args) { 	 
		 long num = 600851475143L; // Long is used because this number...is huge.
		  int largestNum = 0; // Declare variable to store the largest number
		  for (int i = 2; i <= num; i++) {
		   while (num % i == 0) { // Checks if its divisible 
		    if (i > largestNum){ // If it is, is it bigger than the last divisible number?
		    	largestNum = i; // If true, change the variable
		    }
		    num = num / i; // Divide and check the next number if divisible!
		   }
		  }
		  System.out.println(largestNum);
		 } 
	 }
	