import java.util.Scanner;
class MarkSheetGenerator{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int c,math,dbms,ds,os,roll;
     
     System.out.println("Enter Student Roll Number");
     roll = sc.nextInt();
     
     System.out.println("Enter C Marks");
     c = sc.nextInt();
     
     System.out.println("Enter Math Marks");
     math = sc.nextInt();
     
     System.out.println("Enter DBMS Marks");
     dbms = sc.nextInt();
     
     System.out.println("Enter DS Marks");
     ds = sc.nextInt();
     
     System.out.println("Enter OS Marks");
     os = sc.nextInt();
   
     String cAtkt, mathAtkt,dbmsAtkt,dsAtkt,osAtkt,status;
     cAtkt = mathAtkt = dbmsAtkt = dsAtkt = osAtkt = "";
     status = "PASS";
     
     if(c < 33){
       cAtkt = "ATKT";
       status = "FAIL";
     }
     if(math < 33){
       mathAtkt = "ATKT";
       status = "FAIL";
     }
     if(dbms < 33){
       dbmsAtkt = "ATKT";
       status = "FAIL";
     }
     if(ds < 33){
       dsAtkt = "ATKT";
       status = "FAIL";
     }  
     if(os < 33){
       osAtkt = "ATKT";  
       status = "FAIL";
     }
     System.out.println("\t\t\tD.A.V.V");
     System.out.println("-----------------------------------------------------------");
     System.out.println("Name : Cheeku Singh");
     System.out.println("Roll : "+roll);
     System.out.println("-----------------------------------------------------------");
     System.out.println("C-programming\t\t\t"+c+"/100\t\t"+cAtkt);
     System.out.println("Math         \t\t\t"+math+"/100\t\t"+mathAtkt);
     System.out.println("DBMS         \t\t\t"+dbms+"/100\t\t"+dbmsAtkt);
     System.out.println("DS           \t\t\t"+ds+"/100\t\t"+dsAtkt);
     System.out.println("OS           \t\t\t"+os+"/100\t\t"+osAtkt);
     System.out.println("-----------------------------------------------------------");        
     System.out.println("Total :      \t\t\t"+(c+math+dbms+ds+os)+"/500\t\t"+status); 
   }
}




