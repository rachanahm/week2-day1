import java.util.Scanner;
class example6 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int basic,hra,da,gross;
 
    System.out.println("Enter the basic salary");
    basic =s.nextInt();

    hra=(basic*89)/100;
    da=(basic*90)/100;
    gross=basic+hra+da;
  
 
    System.out.println("the gross salary is : " + gross);
  
 
  }
}