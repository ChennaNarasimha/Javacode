package com.TreeDataStructure;

public class PostOrderTraversal {
public static <T> void postOrder(Node<T> root) {
		
		if(root==null) {
			return;
		}
		postOrder(root.getLeftChild());
		postOrder(root.getRightChild());
		System.out.print(root.getData()+"->");
		 
	}
	public static void main(String args[]) {
		Node<String> a=new Node<>("A");
		Node<String> b=new Node<>("B");
		Node<String> c=new Node<>("C");
		Node<String> d=new Node<>("D");
		Node<String> e=new Node<>("E");
		Node<String> f=new Node<>("F");
		Node<String> g=new Node<>("G");
		Node<String> h=new Node<>("H");
		Node<String> i=new Node<>("I");
		
		a.setLeftChild(b);
		a.setRightChild(c);
		postOrder(a);
		b.setLeftChild(d);
		b.setRightChild(e);
		System.out.println("\n");
		postOrder(a);
		c.setLeftChild(f);
		c.setRightChild(g);
		System.out.println("\n");
		postOrder(a);
	}
}
