import java.util.Arrays;
import java.util.Scanner; 
public class Methods { 
 /**
 * @param args
 */
// public static void main(String[] args) {
//   int ans = sum();
//   System.out.printf("Your sum is = " + ans);
//  }

//   static int sum() {
//   System.out.println("Enter Your Numbers: ");
//   Scanner input = new Scanner(System.in);
//   int a = input.nextInt();
//   int b = input.nextInt();
//   int c = input.nextInt();
//   int sum = a + b + c;
//   return sum;
//  }

  /*Arguments */
  // public static void main(String[] args) {
  //   System.out.println("Enter Your Numbers: ");
  //   Scanner input = new Scanner(System.in);
  //   int a = input.nextInt();
  //   int b = input.nextInt();
  //   int ans = sum2(a, b);
  //   System.out.println("Your sum is = " + ans);
  //  }

  //  static int sum2(int a, int b) {
  //   int sum = a + b;
  //   return sum;
  //  }

  //Swap
  // public static void main(String[] args) {
  //   int a = 10;
  //   int b = 20;

  //   int temp = a;
  //   a = b;
  //   b = temp;

  //   System.out.println(a + " " + b);
  // }
  public static void main(String[] args) {
    
    String name = "Kundan Sahu";
    str(name);

    int num = 10;
    System.out.println(num);
    {
      System.out.println(num);
      num = 12;
      System.out.println(num);
    }
  }

  static void str(String naam) {
    naam = "Kundan Kumar Sahu";
    System.out.println(naam);

    fun(3,3,3,5,23,43);
  }

  static void fun(int ...v) {
    System.out.println(Arrays.toString(v));
  }
}