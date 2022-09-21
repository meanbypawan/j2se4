import java.util.Scanner;
// Addition of 2 number
class Addition{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter 1st integer number");
      int a = sc.nextInt();
   
      System.out.println("Enter 2nd integer number");
      int b = sc.nextInt(); 
   
      //System.out.println("a : "+a);
      //System.out.println("b : "+b);
   
      int c = a + b;
      System.out.println("Result : "+c);
   }
}

