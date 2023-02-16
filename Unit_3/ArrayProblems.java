package Unit_3;

public class ArrayProblems {
    static int[][] rotate90(int[][] mat) {
        final int M = mat.length;
        final int N = mat[0].length;
        int[][] newMat = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                newMat[i][j] = mat[j][i];
            }
        }
        for(int i = 0; i < M/2; i++){
            for(int j = 0; j < N; j++) {
                int temp2 = newMat[M-1-i][j];
                newMat[M-1-i][j] = newMat[i][j];
                newMat[i][j] = temp2;
            }
        }
        return newMat;
    }

    static int[][] symmetries(int[][] mat) {
        final int M = mat.length;
        final int N = mat[0].length;
        int[][] newMat = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                newMat[i][j] = mat[j][i];
            }
        }
        return newMat;
    }

    public static void main(String[] arg){
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int[][] newArr = rotate90(arr);
        int[][] newArr2 = symmetries(arr);
        for(int[] currArr : newArr){
            for(int currNum : currArr){
                System.out.print(currNum +",");
            }
            System.out.println();
        }

    }
}
