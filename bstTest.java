package interviews;

/* Program to check if a tree is a BST or not*/

class node{
	int data;
	node left;
	node right;
	public node(){
		this.data = 0;
		this.left = null;
		this.right = null;		
	}
}

public class bstTest {
	
	private node tree; //this is the bst 
	
	bstTest(){
		tree = new node();
	}
	
	public boolean isEmpty(){
		return tree.equals(null);
	}
	
	public void add(int[] values){
		for(int i=0;i<values.length;i++){
			this.addTree(this.tree,values[i]);
		}
	}
	
	public void addTree(node tree,int data){
		if(tree == null ){
			this.tree.data = data;
			this.tree.left = null;
			this.tree.right = null;			
		}
		else{
			if(data > tree.data){
				addTree(tree.right,data);
			}else{
				addTree(tree.left,data);
			}
		}
	}
	
	/*Traversal methods
	op:
	 	'I' - In   - Order
	 	'P' - Post - Order
	 	'E' - Pre  - Order
	*/
	
	public void traversal(char op) 
	{
		System.out.println(this.tree.left);
		/*switch(op){
		case 'I':
			inorder(this.tree);
		}*/
	}
	/*In-Order*/
	public void inorder(node tree){
		if(tree.equals(null)) return;
		inorder(tree.left);
		System.out.print(tree.data);
		inorder(tree.left);		
	}
	
	
	
	public static void main(String[] args){
		int[] values = {9,4,1,2,5,7,3,8,6,10};
		bstTest obj = new bstTest();
		obj.add(values);		
		
		obj.traversal('I');
	}
	
}
