class TestMain{
  public static void main(String args[]){
    System.out.println("5%2 : "+(5%2));
    System.out.println("5/2 : "+(5/2));
    System.out.println("-5%2 : "+(-5%2));
    System.out.println("5%-2 : "+(5%-2));
    System.out.println("-5%-2 : "+(-5%-2));
    System.out.println("2%5 : "+(2%5));
    System.out.println("5.5%2 : "+(5.5%2)); // 1.5
    //System.out.println("5/0 : "+(5/0)); //ArithmeticException 
    System.out.println("5.5/0 : "+(5.5/0));
    System.out.println("-5.5/0 : "+(-5.5/0));
    //System.out.println("5%0 : "+(5%0)); //AE
    System.out.println("5.5%0 : "+(5.5%0)); // NaN
  }
}
