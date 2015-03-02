
public class number4
{
    public boolean isPalindrome( String x )
    {
    	  for ( int i = 0; i < (x.length() / 2) + 1; ++i ) { //Goes through full length of string
    	     if (x.charAt(i) != x.charAt(x.length() - i - 1)) { // If character at index doesn't match character at mirrored index, return false
    	         return false;
    	     }
    	  }

    	  return true; //Else, if everything matches, return true.
    }


public static void main(String[] args)
{
	number4 e = new number4();
    int largestPalindrome  = 0;
    int start1 = 999; // Since 999 is the largest 3 digit number, I used it as the starting points for my loops.
    int	start2 = 999;
    for (int b = start2; b > 0; b--) // Goes through every number 1-999
    {
        for (int a = start1; a > 0; a--) // Goes through every number 1-999
        {
            if ( e.isPalindrome( new Long(a*b).toString() ) ) // Checks if palindrome
            {
                if ( a*b > largestPalindrome ) // If its larger than the largest recorded palindrome, variable is given the new palindrome.
                {
                    largestPalindrome = a*b;
                }
            }
        }
    }

    System.out.println(largestPalindrome); // Prints the largest palindrome
}}