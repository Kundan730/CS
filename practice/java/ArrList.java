import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //Syntax
    // ArrayList<Integer> list = new ArrayList<Integer>(10);

    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // list.add(6);
    // list.add(7);

    // System.out.println(list);//Print the Array list
    
    // list.set(0, 30);//set new elemet to index

    // System.out.println(list);//Updated list
    
    // System.out.println(list.contains(7));//check if it containst specified element

    // System.out.println(list.get(0));//get element at specified index

    // list.remove(3);//remove the index value or element

    // System.out.println(list);//Updated list

    // System.out.println(list.size());//size of the list

    //Input
    // for(int i = 0; i < 7; i++){
    //   list.add(input.nextInt());
    // }

    // for(int i = 0; i < 7; i++){
    //   System.out.println(list);
    // }

    //Output
    // for(int i = 0; i < 7; i++){
    //   System.out.println(list.get(i));//pass index here, list[Index] syntax will not work here
    // }

    // System.out.println(list);

    // ArrayList<ArrayList<Integer>> multiAl = new ArrayList<>();

    // // Initialization
    // for(int i = 0; i < 3; i++) {
    //   multiAl.add(new ArrayList<Integer>());
    // }

    //Add Elements
    // for(int i = 0; i < 3; i++) {
    //   for(int j = 0; j < 3; j++) {
    //     multiAl.get(i).add(input.nextInt());
    //   }
    // }

    //Output
    // for(int i = 0; i < 3; i++) {
    //   for(int j = 0; j < 3; i++) {
    //     System.out.print(multiAl.get(i).get(j) + " ");
    //   }
    // }
    // System.out.println();

    // System.out.println(multiAl);
    
    //swap
    int[] arr = {1,2,3,4,5,6,7};

    // swap(arr, 2, 6);

    reverse(arr);

    System.out.println(Arrays.toString(arr));

    //max vlaue
    // int[] arr = {1,2,3,4,5,6,7};

  }

  static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length-1;

    while(start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    }

  // static int max(int[] arr) {
  //   int maxVal = arr[0];
  //   for(int i = 1; i < arr.length; i++) {
  //     if(arr[i] > maxVal) {
  //       maxVal = arr[i];
  //     }
  //   }
  //   return maxVal;
  // }
}
