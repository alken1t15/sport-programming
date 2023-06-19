package leetcode;

public class Main {
    public static void main(String[] args) {
        int arr[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
        int[][] array = matrix;
        for(int i = 0;i<matrix.length;i++){
            for (int j = 0 ; j< matrix.length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
