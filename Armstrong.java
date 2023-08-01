package java_projects;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		int sum = 0;
		Scanner ns = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = ns.nextInt();
		int temp = num;
		while(num != 0) {
			int rem = num % 10;
			sum += (rem*rem*rem);
			num /= 10;
			System.out.println(num);
		}
		if (temp == sum) {
			System.out.println("The Number Is Armtrong");
		}
		else {
			System.out.println("The Number is Not an Armstrong");
		}
		ns.close();
	}

}
