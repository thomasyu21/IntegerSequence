public class Tester{
  public static void main(String[] args){
    IntegerSequence a = new Range(0, 10);
    IntegerSequence b = new Range(10, 10);
    //IntegerSequence c = new Range(20, 10);
    IntegerSequence d = new Range(10, 15);
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

    while(d.hasNext()){
      System.out.print(d.next());
      if( d.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    String test = "10, 11, 12, 13, 14, 15";
    System.out.println(test);
  }
}
