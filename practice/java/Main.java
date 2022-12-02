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

  //  Scanner input = new Scanner(System.in);
  //  int a = input.nextInt();
  //  int b = input.nextInt();
  //  int c = input.nextInt();

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

  // int max = Math.max(c, Math.max(a, b));
  // System.out.println(max);

  /*Uppercase or lowercaes */
  // Scanner input = new Scanner(System.in);
  // char ch = input.next().trim().charAt(0);
  
  // if(ch >= 'a' && ch <= 'z') {
  //   System.out.println("lowercase");
  // }
  // else if(ch >= 'A' && ch <= 'Z') {
  //   System.out.println("Uppercase");
  // }
  // else {
  //   System.out.println("Invalid");
  // }

  /*Fibo */
  // Scanner input = new Scanner(System.in);

  // int n = input.nextInt();
  // int p = 0;
  // int i = 1;
  // int count = 2;

  // while(count <= n) {
  //   int temp = i;
  //   i = i + p;
  //   p = temp;
  //   count++;
  // }
  // System.out.println(i);

  /*count number */

  // Scanner input = new Scanner(System.in);

  // int n = input.nextInt();

  // int count = 0;

  // while(n > 0) {
  //   int rem = n % 10;
  //   if(rem == 7) {
  //     count++;
  //   }
  //   n = n / 10;
  // }
  // System.out.println(count);

  /*Reverse number */

  // Scanner input = new Scanner(System.in);

  // int num = input.nextInt();
  
  // int ans = 0;

  // while(num > 0) {
  //   int rem = num % 10;

  //   num = num / 10;

  //   ans = ans * 10 + rem;
  // }
  // System.out.println(ans);


  /*Calculator */
  // Scanner input = new Scanner(System.in);

  // int ans = 0;

  // while(true) {
  //   int op = input.next().trim().charAt(0);

  //   if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
  //     // Input two numbers
  //     int num1 = input.nextInt();
  //     int num2 = input.nextInt();

  //     if(op == '+') {
  //       ans = num1 + num2;
  //     }
  //     else if(op == '-') {
  //       ans = num1 - num2;
  //     }
  //     else if(op == '*') {
  //       ans = num1 * num2;
  //     }
  //     else if(op == '/') {
  //       if(num2 != 0) {
  //         ans = num1 / num2;
  //       }
  //       else {
  //         System.out.println("Invalid");
  //       }
  //     }
  //     else if(op == '%') {
  //       ans = num1 % num2;
  //     }
  //   }
  //   else if(op == 'x' || op == 'X') {
  //     break;
  //   }
  //   else {
  //     System.out.println("Invalid");
  //   }
  //   System.out.println(ans);
  // }

  /*Switch Case */
  Scanner input = new Scanner(System.in);
  String fruit = input.next();

  switch(fruit) {
    case "Apple" -> System.out.println("Red");
    case "Banana" -> System.out.println("Yellow");
    case "Mango" -> System.out.println("King of fruits");
    default -> System.out.println("Invalid");
  }
 }
} 
