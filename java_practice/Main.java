import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Array numbers = new Array(3);
    // numbers.insert(10);
    // numbers.insert(20);
    // numbers.insert(40);
    // numbers.insert(70);
    // numbers.insert(30);
    // numbers.insert(60);
    // numbers.insert(50);
    // numbers.removeAt(6);
    // numbers.print();
    // System.out.println(numbers.indexOf(40));
    // System.out.println(numbers.indexOf(100));
    // System.out.println(numbers.max());

    // Array numbers2 = new Array(3);
    // numbers2.insert(10);
    // numbers2.insert(20);
    // numbers2.insert(40);
    // numbers2.reverse();
    // numbers2.print();

    // Array numbers3 = new Array(3);
    // numbers3.insert(10);
    // numbers3.insert(20);
    // numbers3.insert(40);
    // numbers3.insert(50);
    // numbers3.insert(30);
    // numbers3.insertAt(5, 100);
    // numbers3.print();
    var list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addFirst(5);
    list.print();
    // System.out.println("--------");
    // list.removeFirst();
    // list.print();
    // System.out.println("--------");
    // list.removeLast();
    // list.print();
    // System.out.println("--------");
    // System.out.println(list.indexOf(5));

    // var array = list.toArray();
    // System.out.println(Arrays.toString(array));
    // list.reverse();
    // list.print();

    // System.out.println(list.getKthFromTheEnd(1));
    list.middle();
    var list1 = LinkedList.createWithLoop();
    System.out.println(list1.hasLoop());
    System.out.println(list.hasLoop());
  }

}
