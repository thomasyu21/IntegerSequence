import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    if (start <= end){
      this.start = start;
      this.end = end;
      current = start;
    }
  }

  public void reset(){
    current = 0;
  }

  public int length(){
    return (end+1)-start;
  }

  public boolean hasNext(){
    return current < end;
  }

  public int next() throws NoSuchElementException{
      try{
      hasNext();
    }
    catch (NoSuchElementException e){
    }
    current++;
    return current-1;
  }
}
