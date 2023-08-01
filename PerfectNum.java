package java_projects;

public class PerfectNum {

	public static void main(String[] args) {
		int term = 28;
		int sum = 0;
		for(int i = 1; i < term; i++) {
			if(term % i == 0) {
				sum += i;
			}
		}
		if (term == sum)
			System.out.println("The number is Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}

}
