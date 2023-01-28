package com.example;
package linked;


import java.util.*;

/* Name: FIll IN YOUR NAME
 * Enrollment Status: FILL IN YOUR ENROLLMENT STATUS
 */

/*
 * This simple doubly linked list class maintains a doubly linked list
 * with elements in that are in sorted order (smallest to largest)
 * i.e., the smallest value is in the head node 
 * and the largest value is in the tail node
 */

public class SortedLinkedList {
	
	/*
	 * DO NOT MODIFYY
	 */
	
	static class Node {
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	Node head;
	Node tail;
	
	/*
	 * DO NOT MODIFY
	 * Returns whether or not a list is empty
	 */
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	/*
	 * DO NOT MODIFY
	 * Returns the value in the head node
	 */
	public int getHeadData() {
		return head.data;
	}
	
	/*
	 * DO NOT MODIFY
	 * Returns the value in the tail node
	 */
	public int getTailData() {
		return tail.data;
	}
	
	/*
	 * DO NOT MODIFY
	 * toString method to use for testing
	 */
	public String toString() {
		String s = "";
		if(isEmpty())
			return s;
		Node current = head;
		while(current!=null) {
			s = s+current.data + ",";
			current = current.next;
		}
		return s.substring(0,s.length()-1);
	}

	
	 /****** THIS IS WHERE YOUR IMPLEMENTATION STARTS******/
	 
	
	/*
	 * Inserts a new node in the linked list with data equal to i
	 * Maintains the sorted order of the list
	 */
	public void insert(int i) {
		
		
	}
	
	/*
	 * This method returns true if the list is in sorted order
	 */
	public boolean isSorted() {
		return false;
	}
	
	/*
	 * This method returns a Java LinkedList of integers that matches the SortedLinkedList
	 */
	public LinkedList<Integer> getAscending(){
		return new LinkedList<>();
		
	}
	
	/*
	 * This method returns a Java LinkedList of integers that is the SortedLinkedList
	 * but in descending order (from largest to smallest)
	 */
	public LinkedList<Integer> getDescending(){
		return new LinkedList<>();
	}
	


	
	

}
