
public class number2 {
	public static void main(String [] args){
		int sum = 2; // Starts at two because 2 is an even number but my program is going to skip it.
		int a = 1; // Here I create the first three digits of the fibo sequence
		int b = 2;
		int c = 3;
		while (c < 4000000){
		if ((c % 2) == 0){
            sum = sum + c;}
		a = b;
		b = c;
		c = a + b;
	}
		System.out.println(sum);
	}
}
