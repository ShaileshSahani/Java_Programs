package java_projects;
import java.util.Scanner;
public class MatrixAdd {

	public static void main(String[] args) {
		Scanner nScanner  = new Scanner(System.in);
		System.out.print("Enter Row Order Of Matrix: ");
		int a = nScanner.nextInt();
		System.out.print("Enter Column Order Of Matrix: ");
		int b = nScanner.nextInt();
		int[][] A = new int[a][b];
		int[][] B = new int[a][b];
		int[][] C = new int[a][b];
		
		System.out.print("Enter Element Of Matrix A: ");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				A[i][j] = nScanner.nextInt();
			}
		}
		
		System.out.print("Enter Element Of Matrix B: ");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				B[i][j] = nScanner.nextInt();
			}
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				C[i][j] = 0;
			}
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("Matrix A");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatrix B");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nResult Matrix C");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		nScanner.close();

	}
}
