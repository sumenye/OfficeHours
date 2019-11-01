package officeHours;

import java.util.ArrayList;

public class June3 {
  public static void main(String[] args) {
    int primitive = 1; // this is a primitive, list.remove(a) treats this variable as a position (index),
    // not like a value
    Integer object = 1;// this is an object
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(2);
    list.add(1);
    System.out.println("Removing based on primitive int: " + list.remove(primitive));
    System.out.println("Removing based on object of Integer: " + list.remove(object));
    System.out.println("Remaining values: " + list);
  }
}


