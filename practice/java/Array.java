import java.util.Arrays;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // syntax
    // datatype[] var_name = new datatype[size];
    // Array of primitives
    int[] arr = new int[5];

    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

    System.out.println(arr[2]);

    //directly
    // int[] rollNo = {1,2,3,4,5};

    // for(int i = 0; i < arr.length; i++) {
    //   arr[i] = input.nextInt();
    // }

    // print using for loop
    // for(int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i] + "");
    // }

    for(int num : arr) { // for every element in the array print the element
      System.out.print(num + " "); //here num represent elements of the array
    }

    // System.out.println(Arrays.toString(arr)); 

    //Array of objects
    // String[] str = new String[5];
    
    // for(int i = 0; i < str.length; i++) {
    //   str[i] = input.next();
    // }

    // System.out.println(Arrays.toString(str));
    // str[2] = "Kundan";
    // System.out.println(Arrays.toString(str));

    // Function in arrays
    // int[] fun = {1,2,3,4,5};

    // System.out.println(Arrays.toString(fun));
    // change(fun);
    // System.out.println(Arrays.toString(fun));

  }
  // static void change(int[] arr) {
  //   arr[3] = 7;
  // }
}
