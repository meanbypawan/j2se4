class TestMain{
  public static void main(String args[]){
    int a,b,c,d;
    boolean x;
    a = b = c = d = 10;
    
    x = (a == b) == (c == d);
    System.out.println(x);
    System.out.println("20>10 : "+(20>10));
    System.out.println("20<10 : "+(20<10));
    System.out.println("20>=20 : "+(20>=20));
    System.out.println("20<=10 : "+(20<=10));
    System.out.println("20==10 : "+(20==10));
    System.out.println("20==20 : "+(20==20));
    System.out.println("20!=10 : "+(20!=10));
    System.out.println("20!=20 : "+(20!=20));
  }
}
