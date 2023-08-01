package java_projects;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int sum = 0;
		Scanner ns = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = ns.nextInt();
		int temp = num;
		while(num != 0) {
			int rem = num % 10;
			sum = (sum*10) + rem;
			num /= 10;
		}
		if (temp == sum) {
			System.out.println("The Number Is Palindrome");
		}
		else {
			System.out.println("The Number is Not an Palindrome");
		}
		ns.close();

	}

}
