package com.vinay.synechron.collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		/*Adding an element to LinkedList
		Add element at specific index in LinkedList
		Add element at the beginning and end of LinkedList
		Adding an element to the front of LinkedList
		Remove First and last elements from LinkedList
		Remove element from specific index
		Remove specified element from LinkedList
		Remove All elements from LinkedList
		Append all the elements of a List to LinkedList*/
		
		 LinkedList<String> linkedlist = new LinkedList<String>();

	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);

	       /*Add First and Last Element*/
	       linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist);

	       /*This is how to get and set Values*/
	       Object firstvar = linkedlist.get(0);
	       System.out.println("First element: " +firstvar);
	       linkedlist.set(0, "Changed first item");
	       Object firstvar2 = linkedlist.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);

	       /*Remove first and last element*/
	       linkedlist.removeFirst();
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

	       /* Add to a Position and remove from a position*/
	       linkedlist.add(0, "Newly added item");
	       linkedlist.remove(2);
	       System.out.println("Final Content: " +linkedlist); 

	}

}
