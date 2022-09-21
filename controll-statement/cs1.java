import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter an integer number...");
     int n = scan.nextInt();
     
     if(n>25)
       System.out.println("Indore");
     else  
       System.out.println("Pune");   
   }
}
