package java_projects;

public class Factor {

	public static void main(String[] args) {
		int n = 100;
		System.out.println("Factors Of " + n + ": ");
		for(int i = 1; i <= 100; i ++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
