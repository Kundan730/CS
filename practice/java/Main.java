import java.util.Scanner; 
public class Main { 
 /**
 * @param args
 */
public static void main(String[] args) {
  // Salary calc
   /*int salary = 17000;
   if(salary > 20000) {
    int total = salary + 3000;
   System.out.println(total);
   }
   else if(salary > 10000) {
     System.out.println(salary + 2000);
    } else {
    System.out.println(salary + 1000);
   }*/
  
   //For Loop
   /* for(initialization; conditionals; increment/decrement) {
    println
   }
   */
  /* Scanner input = new Scanner(System.in);
  int n = input.nextInt();
   for(int num = 1; num <= n; num += 1) {
    System.out.print(num + " ");
   }*/
  

   //While Loop 

   /* int a = 1;
   while(a <= 7) {
    System.out.println("A");
    a += 1;
   } */

   Scanner input = new Scanner(System.in);
   int a = input.nextInt();
   int b = input.nextInt();
   int c = input.nextInt();

  //  int max = a;
  //  if(b > max) {
  //   max = b;
  //  }
  //  else if(c > max) {
  //   max = c;
  //  }
  //  System.out.println(max);

  // int max = 0;
  // if (a > b) {
  //   max = a;
  // }else {
  //   max = b;
  // }

  // if (c > max) {
  //   max = c;
  // }
  // System.out.println(max);

  int max = Math.max(c, Math.max(a, b));
  System.out.println(max);
 }
} 
