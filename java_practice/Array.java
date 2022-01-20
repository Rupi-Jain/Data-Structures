
public class Array {
  private int[] items;
  private int count;

  public Array(int length) {
    items = new int[length];
  }

  public void insert(int item) {
    if (items.length == count) {
      int[] newItems = new int[count * 2];

      for (int i = 0; i < count; i++)
        newItems[i] = items[i];

      items = newItems;
    }
    items[count++] = item;
  }

  public void removeAt(int index) {
    if (index < 0 || index >= count)
      throw new IllegalArgumentException();
    for (int i = index; i < count; i++)
      items[i] = items[i + 1];
    count--;
  }

  public int indexOf(int item) {

    for (int i = 0; i < count; i++)
      if (items[i] == item)
        return i;

    return -1;

  }

  public int max() {
    int max = items[0];
    for (int i = 0; i < count; i++)
      if (items[i] > max)
        max = items[i];

    return max;
  }

  public void reverse() {
    System.out.println(items.length);
    int[] newItems = new int[items.length];
    int counter = 0;

    for (int i = items.length - 1; i >= 0; i--)
      newItems[counter++] = items[i];

    items = newItems;
  }

  public void insertAt(int index, int item) {
    if (index < 0 || index > items.length)
      throw new IllegalArgumentException();

    int[] newItems = new int[count + 1];

    int counter = 0;
    for (int i = 0; i < count; i++) {

      if (i == index)
        newItems[counter++] = item;

      newItems[counter] = items[i];
      counter++;
    }

    items = newItems;
  }

  public Array intersect(Array other) {
    var intersection = new Array(count);

    for (int item : items) {
      if (other.indexOf(item) >= 0)
        intersection.insert(item);
    }
    return intersection;
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.println(items[i]);
    }
  }
}
