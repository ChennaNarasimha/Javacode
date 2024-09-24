package com.TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public static <T> void breadthFirst(Node<T> root) {
		
		if(root==null) {
			return;
		}
		Queue<Node<T>> queue=new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node<T> node=queue.remove();
			
			System.out.print(node+" -> ");
			if(node.getLeftChild()!=null) {
				queue.add(node.getLeftChild());
			}
			if(node.getRightChild()!=null) {
				queue.add(node.getRightChild());
			}
		}
	}
	
   
	public static void main(String args[]) {
		Node<Character> a=new Node<>('A');
		Node<Character> b=new Node<>('B');
		Node<Character> c=new Node<>('C');
		Node<Character> d=new Node<>('D');
		Node<Character> e=new Node<>('E');
		Node<Character> f=new Node<>('F');
		Node<Character> g=new Node<>('G');
		Node<Character> h=new Node<>('H');
		
		a.setLeftChild(b);
		a.setRightChild(c);
		System.out.println("");
		breadthFirst(a);
		b.setLeftChild(d);
		b.setRightChild(e);
		System.out.println("\n");
		breadthFirst(a);
		
		c.setLeftChild(f);
		c.setRightChild(g);
		System.out.println("\n");
		breadthFirst(a);
		
		
	}
	
}
