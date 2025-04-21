import java.util.*;
class calculator
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  System.out.println("enter a,b values");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("enter the calculater");
  char var=sc.next().charAt(0);
  switch(var)
  {
   case '+':c=a+b;
    System.out.println(c);
   break;
   case '-':c=a-b;
    System.out.println(c);
   break;
   case '*':c=a*b;
    System.out.println(c);
   break;
   case '/':c=a/b;
    System.out.println(c);
   break;
  }
 }
}
   
