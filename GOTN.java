package java_projects;
import java.util.Scanner;
public class GOTN {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = m.nextInt();
		System.out.print("Enter Second Number: ");
		int b = m.nextInt();
		System.out.print("Enter Third Number: ");
		int c = m.nextInt();
		
		if(a>b && a>c)
			System.out.println("The greatest number is "+a);
		else if(b>a && b>c)
			System.out.println("The greatest number is "+b);
		else
			System.out.println("The greatest number is "+c);
		m.close();
	}

}
