package java_projects;
import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		int sum = 0;
		Scanner ns = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = ns.nextInt();
		while(num != 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum of Digit: " + sum);
		ns.close();
	}

}
