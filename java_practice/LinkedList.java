import java.util.NoSuchElementException;

public class LinkedList {

  private class Node {
    private Node next;
    private int value;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node first;
  private Node last;

  public void addLast(int item) {
    var node = new Node(item);

    if (first == null)
      first = last = node;
    else {
      last.next = node;
      last = node;
    }
  }

  public void addFirst(int item) {
    var node = new Node(item);

    if (isEmpty())
      first = last = node;
    else {
      node.next = first;
      first = node;
    }
  }

  public void removeFirst() {

    if (isEmpty())
      throw new NoSuchElementException();

    if (first == last)
      first = last = null;
    else {
      var second = first.next;
      first.next = null;
      first = second;
    }
  }

  public void removeLast() {

    if (isEmpty())
      throw new NoSuchElementException();

    if (first == last)
      first = last = null;
    else {
      var prev = getPrevious();
      last = prev;
      last.next = null;
    }
  }

  private boolean isEmpty() {
    return first == null;
  }

  private Node getPrevious() {
    var current = first;
    while (current != null) {

      if (current.next == last)
        return current;
      current = current.next;
    }

    return null;
  }

  public void print() {
    Node root = first;
    while (root.next != null) {
      System.out.println(root.value);
      root = root.next;
    }
  }
}
