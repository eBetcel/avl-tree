public class AvlTree {
	protected Node root;
	
	public int calculateHeight (Node node) {
		if (node == null) {
			return 0;
		}
		
		return node.getHeight();
	}
	
	public int max(int a, int b) {
		if (a > b) {
			return a;
		}
		
		else {
			return b;
		}
	}
	
	
	public Node rightRotation (Node y) {
		Node x = y.getLeft();
		Node t2 = x.getRight();
		
		x.setRight(x);
		y.setLeft(t2);
		
		
		int yHeight = max(calculateHeight(y.getLeft()), calculateHeight(y.getRight()) + 1); 
		int xHeight = max(calculateHeight(x.getLeft()), calculateHeight(x.getRight()) + 1); 
		y.setHeight(yHeight);
		x.setHeight(xHeight);
		
		return x;
	}
	
	public Node leftRotation(Node x) {
		Node y = x.getRight();
		Node t2 = y.getLeft();
		
		y.setLeft(x);
		x.setRight(t2);
		
		int xHeight = max(calculateHeight(x.getLeft()), calculateHeight(x.getRight()) + 1); 
		int yHeight = max(calculateHeight(y.getLeft()), calculateHeight(y.getRight()) + 1); 
		x.setHeight(yHeight);
		y.setHeight(xHeight);
		
		return y;
	}

	public int getBalance(Node node) {
		if (node == null) {
			return 0;
		}
		
		return calculateHeight(node.getLeft()) - calculateHeight(node.getRight());
	}
	
	public Node insert(Node node, int key) {
		if(node == null) {
			return (new Node(key));
		}
		
		if (key < node.getKey()) 
	}
}
