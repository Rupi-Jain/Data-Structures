import java.util.NoSuchElementException;

import javax.lang.model.util.ElementScanner14;

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
  private int size;

  public void addLast(int item) {
    var node = new Node(item);

    if (first == null)
      first = last = node;
    else {
      last.next = node;
      last = node;
    }
    size++;
  }

  public void addFirst(int item) {
    var node = new Node(item);

    if (isEmpty())
      first = last = node;
    else {
      node.next = first;
      first = node;
    }
    size++;
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
    size--;
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
    size--;
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

  public int size() {
    return size;
  }

  public int[] toArray() {
    int[] array = new int[size];
    var current = first;
    int index = 0;

    while (current != null) {
      array[index++] = current.value;
      current = current.next;
    }
    return array;
  }

  public void reverse() {
    var previous = first;
    var current = first.next;

    while (current != null) {
      var next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    last = first;
    last.next = null;
    first = previous;
  }

  public int getKthFromTheEnd(int k) {

    if (isEmpty())
      throw new IllegalStateException();

    var a = first;
    var b = first;

    for (int i = 0; i < k - 1; i++) {
      b = b.next;
      if (b == null)
        throw new IllegalArgumentException();
    }

    while (b != last) {
      a = a.next;
      b = b.next;
    }
    return a.value;
  }

  public void middle() {

    if (isEmpty())
      throw new IllegalStateException();

    var a = first;
    var b = first;

    while (b != null && b.next != null) {
      a = a.next;
      b = b.next.next;
    }

    if (b == last)
      System.out.println(a.value);
    else
      System.out.println(a.value + " , " + a.next.value);
  }

  public int indexOf(int item) {
    var current = first;
    int index = 0;

    while (current != null) {
      if (current.value == item)
        return index;
      current = current.next;
      index++;
    }
    return -1;
  }

  public boolean contains(int item) {
    var current = first;

    while (current != null) {
      if (current.value == item)
        return true;
      current = current.next;
    }
    return false;
  }

  public void print() {
    Node current = first;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  public boolean hasLoop() {
    if (isEmpty())
      throw new IllegalStateException();
    var slow = first;
    var fast = first;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast)
        return true;
    }

    return false;
  }

  public static LinkedList createWithLoop() {
    var list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);

    var node = list.last;
    list.addLast(40);
    list.addLast(50);

    list.last.next = node;

    return list;

  }
}
