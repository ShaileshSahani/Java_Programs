package java_projects;
import java.util.*;
public class DectoBin {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
        System.out.println("Enter A Decimal Number: ");
        int n = ns.nextInt();
        int[] ans = new int[10];
        int index = 0;
        while (n > 0){
            ans[index++] = n % 2;
            n = n /  2;
        }
        for (int i = (index-1); i>=0;i--){
            System.out.println(ans[i]);
        }
        ns.close();

	}

}
