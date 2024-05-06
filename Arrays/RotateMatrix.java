import java.util.*;

class RotateMatrix {
    static void rotate(ArrayList<ArrayList<Integer>> matrix) {
        int temp;
        for(int i=0; i<matrix.size(); i++){
        for(int j=i; j<matrix.size(); j++){
          temp=matrix.get(i).get(j);
          matrix.get(i).set(j,matrix.get(j).get(i));
           matrix.get(j).set(i,temp);
        }
    }
    for(int i=0; i<matrix.size(); i++){
        Collections.reverse(matrix.get(i));
    }

    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        
        rotate(arr);
        
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}




// import java.util.*;

//  public class RotateMatrix{
//     public static void Rotate(int[][] matrix){
//         int temp=0;
//         for(int i=0; i<matrix.length; i++){
//             for(int j=i; j<matrix[0].length; j++){
//                 temp=matrix[i][j];
//                 matrix[i][j]=matrix[j][i];
//                 matrix[j][i]=temp;
//             }
//         }
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length/2; j++){
//                 temp=matrix[i][j];
//                 matrix[i][j]=matrix[i][matrix.length-1-j];
//                 matrix[i][matrix.length-1-j]=temp;
//             }
//         }
   
//     }
//    public static void main(String[] args){
   
//          int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//         Rotate(arr);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//   }
//  }




// import java.util.*;

// public class RotateMatrix{
//     public static int[][] Rotate(int[][] matrix){
//         int n = matrix.length;
//         int rotated[][] = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 rotated[j][n - i - 1] = matrix[i][j];
//             }
//         }
//         return rotated;
//     }
//     public static void main(String[] args){
//         int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//         int rotated[][] = Rotate(arr);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < rotated.length; i++) {
//             for (int j = 0; j < rotated.length; j++) {
//                 System.out.print(rotated[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }