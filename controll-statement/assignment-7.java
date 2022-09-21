import java.util.Scanner;
class Assignment7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter 1st value");
    int a = sc.nextInt();
    
    System.out.println("Enter 2nd value");
    int b = sc.nextInt();
    
    System.out.println("Enter 3rd value");
    int c = sc.nextInt();
    int max;
    if(a>b && a>c)
      max = a;
    else{
       if(b>c)
         max = b;
       else
         max = c;
    }
    System.out.println(max+" is greater");
    
    if(max%5==0)
     System.out.println(max+" is a good number");
    else
     System.out.println(max+" is not a good number");      
  }
}
