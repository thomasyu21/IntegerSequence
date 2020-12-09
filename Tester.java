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

    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println(as.length());

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

    int[]nums2 = {};
    IntegerSequence test1 = new ArraySequence(nums2);
    System.out.println(test1.length());

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

    IntegerSequence r = new Range(10,20);
    System.out.println(r.length());
    IntegerSequence as1 = new ArraySequence(r);
    System.out.println(as1.length());

    System.out.println("ArraySequence(seq):");
    while(as1.hasNext()){
      System.out.print(as1.next()+", ");
    }
    System.out.println();

    IntegerSequence as2 = new ArraySequence(b);
    System.out.println(as2.length());
    System.out.println("ArraySequence(seq):");
    while(as2.hasNext()){
      System.out.print(as2.next()+", ");
    }
    System.out.println();
  }
}
