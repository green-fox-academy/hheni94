package counter;

public class Counter {
  int integer;
  int basic = 0;

  public Counter() {
    integer = 0;
  }

  public Counter(int number) {
    integer = number;
    basic = number;
  }

  public void add(int number) {
    integer = integer + number;
  }

  public void add() {
    integer ++;
  }

  public int get() {
    return integer;
  }

  public void reset() {
    integer = basic;
  }

}
