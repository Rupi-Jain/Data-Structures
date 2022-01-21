import java.util.Arrays;

public class TwoStacks {

  private int top1;
  private int top2;
  private int[] items;

  public TwoStacks(int capacity) {
    if (capacity <= 0)
      throw new IllegalArgumentException("capacity can't be zero");
    items = new int[capacity];
    top1 = -1;
    top2 = capacity;
  }

  public void push1(int item) {
    if (isFull1())
      throw new StackOverflowError();

    items[++top1] = item;
  }

  public int pop1() {
    if (isEmpty1())
      throw new IllegalStateException();

    return items[top1--];
  }

  public int peek() {
    if (isEmpty1())
      throw new IllegalStateException();

    return items[top1 - 1];
  }

  public void push2(int item) {
    if (isFull2())
      throw new StackOverflowError();

    items[--top2] = item;
  }

  public int pop2() {
    if (isEmpty2())
      throw new IllegalStateException();

    return items[top2++];
  }

  public boolean isEmpty1() {
    return top1 == -1;
  }

  public boolean isEmpty2() {
    return top2 == items.length;
  }

  public boolean isFull1() {
    return top1 + 1 == top2;
  }

  public boolean isFull2() {
    return top2 - 1 == top1;
  }

  @Override
  public String toString() {
    // var content = Arrays.copyOfRange(items, 0, count);
    return Arrays.toString(items);
  }

  public static void main(String[] args) {
    TwoStacks stack = new TwoStacks(10);
    stack.push1(10);
    stack.push1(20);
    stack.push1(30);
    stack.push2(40);
    stack.push2(50);
    stack.push2(60);
    var val = stack.pop1();
    System.out.println("Pop:" + " , " + val);
    var val2 = stack.pop2();
    System.out.println("Pop2:" + " , " + val2);
    var str = stack.toString();
    System.out.println(str);
  }
}
