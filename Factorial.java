package java_projects;
public class Factorial {
	
	public static void main(String[] args) {
		int n = 5;
		int f=1,i;
		for(i = 1; i<=n; i++)
			f *= i;
		System.out.println("The Factorial is:"+f);
   }
}
