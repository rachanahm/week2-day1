import java.util.Scanner;
class example8 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int num;
 
    System.out.println("Enter the number");
    num =s.nextInt();

    if(num==0)
    {
   System.out.println("the number is zero");
    }
    else if(num%2==0)
    {
  System.out.println("the number is even");
    }
     else
    {
  System.out.println("the number is odd");
    }
  
 
  }
}