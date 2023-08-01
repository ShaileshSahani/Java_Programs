package java_projects;
import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 1, 2, 1, 4, 5, 6, 7, 4, 6, 3, 4, 2, 3, 4};
		Arrays.sort(n);
		int s = n.length;
		int temp[] = new int[s];
		int r = 0; 
		for(int i = 0; i < s - 1; i++) {
			if(n[i] != n[i + 1]) {
				temp[r++] = n[i];
			}
		}
		temp[r++] = n[s - 1];
		for(int j = 0; j < r; j++) {
			System.out.println(temp[j]);
		}
	}

}
