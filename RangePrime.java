package java_projects;
import java.util.*;
public class RangePrime {
	
	int Prime(int first, int last) {
		for(int i = first; i <= last; i++) {
			int flag = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag++;
					break;
				}
			}
			if (flag == 0)
				System.out.println(i);
		}
		return 0;
	}
	public static void main(String[] args) {

		Scanner ns = new Scanner(System.in);
		System.out.print("Enter Start Point: ");
		int first = ns.nextInt();
		System.out.print("Enter The End Point: ");
		int last = ns.nextInt();
		RangePrime obj = new RangePrime();
		obj.Prime(first, last);
		ns.close();
		}
}
