public class MatrixOperations {
    public static void main(String args[]){
        // Initialize a 2D matrix with values
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        // Find and print the sum of all elements in the matrix
        int sum = calculateMatrixSum(matrix);
        System.out.println("Sum of Matrix Elements: " + sum);
        // Transpose the matrix and print the result
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }
    // Method to print a 2D matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Method to calculate the sum of all elements in a 2D matrix
    private static int calculateMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
    // Method to transpose a 2D matrix
    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
    }
