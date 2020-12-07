public class Tester{
  public static void main(String[] args){
    IntegerSequence a = new Range(0, 10);
    IntegerSequence b = new Range(10, 10);
    System.out.println(a.length());
    System.out.println(b.length());
    System.out.println(a.hasNext());
    System.out.println(b.hasNext());
    while(a.hasNext()){
      System.out.print(a.next());
      if( a.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    while(b.hasNext()){
      System.out.print(b.next());
      if( b.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
  }
}
