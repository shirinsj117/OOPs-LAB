import java.util.Scanner;
class Symmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols =scanner.nextInt();
        
        if (rows !=cols) {
            System.out.println("The matrix is not symmetric because it's not square.");
            return;
        }
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }
        if (isSymmetric){
                System.out.println("The matrix is symmetric.");
            } else {
                System.out.println("The matrix is not symmetric.");
            }
        }
    }
        