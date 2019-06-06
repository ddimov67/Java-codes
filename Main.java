
public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 10, 5, 8}, {-5, 2, 30, 2}, {8, 12, 6, 3}, {12, 7, 8, 1}};
        System.out.println();
        System.out.println("Matrix1 is:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("  " + matrix1[i][j]);
            }
            System.out.println();
        }


        int[][] matrix2 = {{1, 11, 7, 8}, {-5, 6, 30,7}, {8, 14, 6, 3}, {12, 6, 8,9}};
        System.out.println();
        System.out.println("Matrix2 is:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("  " + matrix2[i][j]);
            }
            System.out.println();
        }
int[][] matrix3=new int[matrix1.length][matrix1.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j]= matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println();
         System.out.println("Matrix3 is:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print("  " + matrix3[i][j]);
            }
            System.out.println();
        }
    }
}