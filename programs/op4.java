class TestMain{
  public static void main(String args[]){
     
     int amount = 9846;
     int n2000,n500,n200,n100,n50,n20,n10,n5;
     
     n2000 = amount/2000;
     
     //amount = amount - 2000*n2000;
     amount =  amount %2000; // 567
     
     n500 = amount/500;
  
     amount = amount%500; // amount  = 67
  
     n200 = amount / 200;
     amount = amount % 200; // 67%200 = 67
     
     n100 = amount / 100;
     amount = amount % 100;
     
     n50 = amount / 50;
     amount = amount % 50;
     
     n20 = amount / 20;
     amount = amount % 20;
     
     n10 = amount /10;
     amount = amount % 10;
     
     n5 = amount / 5;
     amount = amount % 5;
  
     System.out.println("Details of notes");
     System.out.println("2000 rupaye ka "+n2000+" note");
     System.out.println("500 rupaye ka "+n500+" note");
     System.out.println("200 rupaye ka "+n200+" note");
     System.out.println("100 rupaye ka "+n100+" note");
     System.out.println("50 rupaye ka "+n50+" note");
     System.out.println("20 rupaye ka "+n20+" note");
     System.out.println("10 rupaye ka "+n10+" note");
     System.out.println("5 rupaye ka "+n5+" note");
  }
}
