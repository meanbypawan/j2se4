import java.util.Scanner;
class CheckForVote{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Tell me your age...");
     int age = sc.nextInt();
     
     if( age >=0 ){
       if(age >= 18){
         System.out.println("You can vote..");
         System.out.println("You can marry...");
       }
       else 
         System.out.println("Sorry! You can't vote");  
     }
     else
       System.out.println("Invalid Input...");
  }
}
