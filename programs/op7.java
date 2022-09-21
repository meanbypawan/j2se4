class TestMain{
  public static void main(String args[]){
     int a,b,c,d;
     boolean x;
     a = 10;
     b = 20;
     c = 30;
     d = 40;
     
     x = (a < b) && (++c < d);
     System.out.println("a : "+a);
     System.out.println("b : "+b);
     System.out.println("c : "+c);
     System.out.println("d : "+d);
     System.out.println("x : "+x);
     
  }
}
