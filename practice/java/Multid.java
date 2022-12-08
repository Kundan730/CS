import java.util.Scanner;
import java.util.Arrays;

public class Multid {
  public static void main(String[] args) {

    // int[][] arr = new int[3][3];

    // int[][] arr = {
    //   {1,2,3},
    //   {4,5,6},
    //   {7,8,9}
    // };

    // for(int[] row : arr) {
    //   System.out.println(Arrays.toString(row));
    // }

    /*2d array input */

    int[][] arr2d = {
      {1,2,3},//0th index
      {4,5},//1st index
      {6,7,8,9}//2nd index -> arr[2] = {6,7,8,9} || arr[1] = 7
    };

    // Scanner input = new Scanner(System.in);

    // int[][] arr2d = new int[3][3];

    // System.out.println(arr2d.length);//no of rows

    // for(int row = 0; row < arr2d.length; row++) {//for each row
    //   for(int col = 0; col < arr2d[row].length; col++) {
    //     arr2d[row][col] = input.nextInt();
    //   }
    // }

    //Output
    for(int row = 0; row < arr2d.length; row++) {//for each row
      for(int col = 0; col < arr2d[row].length; col++) {
        System.out.print(arr2d[row][col] + " ");
      }
      System.out.println();
    }

    // for(int row = 0; row < arr2d.length; row++) {
    //   System.out.println(Arrays.toString(arr2d[row]));
    // }

    // for(int[] row : arr2d) {
    //   System.out.println(Arrays.toString(row));
    // }

    // for(int[] arr : arr2d) {//enhanced for loop (optimized)
    //   System.out.println(Arrays.toString(arr));
    // }

  }
}
