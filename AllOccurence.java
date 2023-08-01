package java_projects;
import java.util.Scanner;

public class AllOccurence {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int[] n = {1, 2, 3, 4, 5, 5, 6, 7, 6, 7, 6, 7, 1, 2, 3, 4, 5};
		for(int i = 0; i < n.length; i++) {
			int count = 0;
			for(int j = 0; j < n.length; j++) {
				if (n[i] == n[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(String.format("The Element %d Occured %d times", n[i] , count));
			}
		}
		ns.close();

	}

}
