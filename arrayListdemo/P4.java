import java.util.*;

// Create a LinkedList and perform various operations like add, remove, and iterate over it.
// and we ccan also use linked list provided by collection frame work
public class P4 {
  public static void main(String[] args) {
    List<Integer> LL = new LinkedList<>();
    LL.add(1);
    LL.add(2);
    LL.add(12);
    LL.add(553);

    LL.remove(2);

    for (Integer elem : LL) {
      System.out.println(elem);
    }
  }
}

// class ListNode {// nested class
// int value;
// ListNode next;

// public ListNode(int value) {
// this.value = value;
// this.next = null;
// }

// public ListNode(int value, ListNode next) {
// this.value = value;
// this.next = next;
// }
// }

// class LinkedLists {
// private int length;
// private ListNode head;
// private ListNode tail;

// // class ListNode { // this can also be done using nested class nested class
// // int value;
// // ListNode next;

// // public ListNode(int value) {
// // this.value = value;
// // this.next=null;
// // }

// // public ListNode(int value,ListNode next) {
// // this.value = value;
// // this.next=next;
// // }
// // }

// public LinkedLists(int value) {
// ListNode newListNode = new ListNode(value);
// head = newListNode;
// tail = newListNode;
// length = 1;
// }

// public void printList() { // to print List
// ListNode temp = head;
// while (temp != null) {
// System.out.println(temp.value);
// temp = temp.next;
// }
// }

// public void getHead() { // to print wether is list is null
// if (head == null) {
// System.out.println("Head: null");
// } else {
// System.out.println("Head: " + head.value);
// }
// }

// public void getTail() { // same for tail
// if (head == null) {
// System.out.println("Tail: null");
// } else {
// System.out.println("Tail: " + tail.value);
// }
// }

// public void getLength() { // to get length of tail
// System.out.println("Length: " + length);
// }

// public void append(int value) {
// ListNode temp = new ListNode(value);
// if (head == null) {
// head = temp;
// tail = temp;
// } else {
// tail.next = temp;
// tail = temp;
// }
// length++;
// }

// public void remove() {

// switch (length) {
// case 0:
// throw new ArrayIndexOutOfBoundsException();
// case 1:
// head = null;
// tail = null;
// break;
// default:
// ListNode temp1 = head;
// while (temp1.next != tail) {
// temp1 = temp1.next;
// }
// tail = temp1;
// temp1.next = null;
// break;
// }
// length--;
// }

// public ListNode removeLast() {
// if (length == 0)
// return null;
// ListNode temp = head;
// ListNode pre = head;
// while (temp.next != null) {
// pre = temp;
// temp = temp.next;
// }
// tail = pre;
// tail.next = null;
// length--;
// if (length == 0) {
// head = null;
// tail = null;
// }
// return temp;
// }

// public void prepend(int value) {
// ListNode newListNode = new ListNode(value);
// if (length == 0) {
// head = newListNode;
// tail = newListNode;
// } else {
// newListNode.next = head;
// head = newListNode;
// }
// length++;
// }

// public int findMiddleNode() {
// ListNode fast = head;
// ListNode slow = head;
// while (fast != null && fast.next != null) {
// fast = fast.next.next;
// slow = slow.next;
// }
// return slow.value;
// }

// }
// this is the custom linked list implementation ......
