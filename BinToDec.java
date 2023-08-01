package java_projects;
import java.util.*;
public class BinToDec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = 0;
        int res = 0;
        System.out.println("Enter A Binary Number: ");
        int binaryNumber = scanner.nextInt();
        while (binaryNumber > 0){
            int rem = binaryNumber % 10;
            res += rem * Math.pow(2, n);
            binaryNumber /= 10;
            n++;
        }
        System.out.println(res);
        scanner.close();
	}

}
