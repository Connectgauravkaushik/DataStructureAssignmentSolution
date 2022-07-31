package com.greatlearning.BST.RightSkew;
class Node {
		int key;
		Node left,right;
		

Node(int data) {
		key = data;
        left=right=null;  
	}
}
public class RightSkew{
	public static Node node;
	static Node prevNode=null;
	static Node headNode=null;

	static void RightSkewed(Node root, int order) {
		if(root==null) {
			return;
		}
	   if(order > 0) {
		  RightSkewed(root.right,order); 
	   }
	   else {
		   RightSkewed(root.left,order);  
	   }
		Node rightNode = root.right;
		Node leftNode = root.left;
		if(headNode == null) {
			headNode = root;
			root.left=null;
			prevNode=root;
		}
		else {
			prevNode.right = root;
			root.left=null;
			prevNode = root;
		}
		
		if(order > 0) {
			RightSkewed(leftNode,order);
		}
		else {
			RightSkewed(rightNode, order);
		}
	}

 public static  void TraverseTree(Node root) {
	if(root==null)
	{
		return;
	     }
		System.out.print(root.key+ " ");
		TraverseTree(root.right);

    }
	public static void main(String []args) {
		RightSkew tree = new RightSkew();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		int order = 0;
		RightSkewed(node, order);
		TraverseTree(headNode);
	}
   }

