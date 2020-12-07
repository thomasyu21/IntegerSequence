import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int startv,  int endv){
    if (startv <= endv){
      start = startv;
      end = endv;
      current = 0;
    }
  }

  public void reset(){
    current = 0;
  }

  public int length(){
    return (end+1)-start;
  }
}
