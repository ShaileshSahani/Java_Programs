package java_projects;

public class MatrixMul {
    public static void main(String[] args) {
        int[][] a  = {{1, 2, 3},
                      {3, 2, 1},
                      {4, 3, 6}};
        int[][] b  = {{1, 2, 3},
                      {3, 2, 1},
                      {4, 3, 6}};
        int[][] c = {{0, 0, 0},
                     {0, 0, 0},
                     {0, 0, 0}};
        
        for (int i=0; i<3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<3;i++){
            for(int j = 0;j < 3;j++){
                for (int k=0;k<3;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("\n" + "Result:");
        for (int i=0; i<3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
