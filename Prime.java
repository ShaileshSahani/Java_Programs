package java_projects;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int number = ns.nextInt();
		int flag = 0;
		if (number < 0) {
			System.out.println("The number You Entered is Negative");
		}
		else if(number == 0) {
			System.out.println("Number is Zero");
		}
		else if (number == 1) {
			System.out.println("1 is neither Prime nor Composite");
		}
		else if (number == 2) {
			System.out.println("2 is Even Prime");
		}
		else {
			for (int i = 2; i < number;i++) {
				if (number % i == 0) {
					flag++;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number + " Is Prime");
			}
			else {
				System.out.println(number + " Is Not Prime");
			}
		}
		ns.close();
	}
}
