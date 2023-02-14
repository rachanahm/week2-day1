import java.util.Scanner;
class example7 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int num1;
 
    System.out.println("Enter the number");
    num1 =s.nextInt();

    if(num1>=0)
    {
   System.out.println("the number is positive");
    }
    else
    {
  System.out.println("the number is negative");

    }
  
 
  }
}