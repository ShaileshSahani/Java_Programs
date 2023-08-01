package java_projects;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = ns.nextInt();
		for(int i = 1;i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
		ns.close();
	}

}
