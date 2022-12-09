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

  // Scope
  // public static void main(String[] args) {
    
  //   String name = "Kundan Sahu";
  //   str(name);

  //   int num = 10;
  //   System.out.println(num);
  //   {
  //     System.out.println(num);
  //     num = 12;
  //     System.out.println(num);
  //   }

  //   fun("kundan", "Flash");
  // }

  // static void str(String naam) {
  //   naam = "Kundan Kumar Sahu";
  //   System.out.println(naam);

  //   multiple(3,3,3,5,23,43);

  // }

  // static void multiple(int a,int ...v) {
  //   System.out.println(Arrays.toString(v));
  // }

  // static void fun(String num) {
  //   System.out.println(num);
  // }

  // static void fun(String a, String b) {
  //   System.out.println(a + " " + b);
  // }

  /*Is Prime */
  // public static void main(String[] args) {
  //   Scanner input = new Scanner(System.in);
  //   int num = input.nextInt();
  //   boolean ans = isPrime(num);
  //   System.out.println(ans);
  // }

  // static boolean isPrime(int num) {
  //   if(num <= 1) {
  //     return false;
  //   }
  //   int c = 2;
  //   while(c * c <= num) {
  //     if(num % c == 0) {
  //       return false;
  //     }
  //     c++;
  //   }
  //   return c * c > num;
  // }

  //Armstrong 
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // int num = input.nextInt();
    // boolean ans = isArmstrong(num);
    // System.out.println(ans);
    
    for(int i = 100; i < 1000; i++) {
      if(isArmstrong(i)) {
        System.out.println(i + "");
      }
    }
  }

  static boolean isArmstrong(int num) {
    int temp = num;
    int sum = 0;

    while(temp > 0) {
      int rem = temp % 10;
      sum = sum + rem * rem * rem;
      temp /= 10;
    }
    return sum == num;
  }
  // static boolean isArmstrong(int num) {
  //   int sum = 0;

  //   for(int temp = num; temp > 0; temp /= 10) {
  //     int rem = temp % 10;
  //     sum = sum + rem * rem * rem;
  //   }
  //   return sum == num;
  // }
}