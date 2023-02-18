package p1;
import java.util.Scanner;
 class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class Tree {
	static Scanner sc=new Scanner(System.in);
	 Node CreateTree() {
		Node root=null;
		System.out.println("Enter data ");
	 int data=	sc.nextInt();
	 if(data==-1) return null;
	 root=new Node(data);
	 System.out.println("Enter left of "+data);
	 root.left=CreateTree();
	 System.out.println("Enter right of "+data);
	 root.right=CreateTree();
	 
	 
		
		
		return root;
	}
	 void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	 void preOrder(Node root) {
			if(root==null) return;
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	 void postOrder(Node root) {
			if(root==null) return;
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
        Node root=t.CreateTree();
        t.inOrder(root);
        t.preOrder(root);
        t.postOrder(root);
	}

}
