import java.util.Scanner;
class Assignment10{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter A Number B/W (1 to 5)...");
    int n = sc.nextInt();
    
    // n = 3
    if(n == 1 || n == -1)
      System.out.println("ONE");
    
    if(n == 2 || n == -2)
      System.out.println("TWO");
      
    if(n == 3 || n == -3)
      System.out.println("THREE");
      
    if(n == 4 || n == -4)
      System.out.println("FOUR");
      
    if(n == 5 || n == -5)
      System.out.println("FIVE");        
  
    if(n < -5 || n > 5 || n == 0)
      System.out.println("Invalid Input");
  }
}
