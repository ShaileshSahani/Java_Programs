package java_projects;

import java.util.Scanner;

public class IntOccurance {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int[] n = {1, 2, 3, 4, 5, 5, 6, 7, 6, 7, 6, 7, 1, 2, 3, 4, 5};
		int count = 0;
		System.out.print("Enter The Number: ");
		int val = ns.nextInt();
		for(int i = 0; i < n.length; i++) {
			if(val == n[i]) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println(String.format("The Element Occured %d times", count));
		}
		else {
			System.out.println("No Repetetion of the element");
		}
		ns.close();
	}
}
