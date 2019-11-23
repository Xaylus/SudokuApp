import java.util.ArrayList;
import java.util.List;

public class linkedList {

	private Link root = null;
	private Link next = null;
	private ArrayList<Integer> temp;
	
	private int gridLength = 9;
	private int gridHeight = 9;

	public void addItemRight(int item) {
		
		if(root==null) {
		root = new Link(item);
		root.setLeft(root);
		root.setRight(root);
		root.setDown(root);
		root.setUp(root);
		}
		
	}
	
	public void addItemRight(char c, int r) {
		
		if(root==null) {
			root = new Link(c, r);
			root.setLeft(root);
			root.setRight(root);
			root.setHead(root);
			root.setDown(root);
			root.setUp(root);
		}
		else {
			next = new Link(c,r);
			next.setRight(root.getRight());
			next.setLeft(root);
			next.setHead(next);
			next.setUp(next);
			next.setDown(next);
			root.setRight(next);
			//root.setDown(next);
			next.getRight().setLeft(next);
			root = next;
		}
		
	}
	////////////////////////////////
	public void addItemRight(char c, int r, int num) {
		
		if(root==null) {
			root = new Link(c, r);
			root.setLeft(root);
			root.setRight(root);
			root.setHead(root);
			root.setDown(root);
			root.setUp(root);
			root.setAnswer(num);
			
			if(num != 0) {
				temp = new ArrayList<Integer>();
				temp.add(num);
				root.setNumbers(temp);
			}
		}
		else {
			next = new Link(c,r);
			next.setRight(root.getRight());
			next.setLeft(root);
			next.setHead(next);
			next.setUp(next);
			next.setDown(next);
			root.setRight(next);
			//root.setDown(next);
			next.getRight().setLeft(next);
			next.setAnswer(num);
			root = next;
			
			if(num != 0) {
				temp = new ArrayList<Integer>();
				temp.add(num);
				root.setNumbers(temp);
			}
		}
		
	}
	///
	public void addItemDown(char c, int r, int num) {
		
		if(root==null) {
			root = new Link(c, r);
			root.setLeft(root);
			root.setRight(root);
			root.setHead(root);
			root.setDown(root);
			root.setUp(root);
			root.setAnswer(num);
			
			if(num != 0) {
				temp = new ArrayList<Integer>();
				temp.add(num);
				root.setNumbers(temp);
			}
			
		} else {
			next = new Link(c,r);
			next.setRight(next);
			next.setLeft(next);
			next.setUp(root);
			next.setHead(root.getHead());
			next.setDown(root.getDown());
			next.getDown().setUp(next);
			root.setDown(next);
			next.setAnswer(num);
			root = next;
			
			if(num != 0) {
				temp = new ArrayList<Integer>();
				temp.add(num);
				root.setNumbers(temp);
			}
		}
		
		
	}
	////////////////////////////////////////////////
	
	
	
	public void addItemDown(char c, int r) {
		
		if(root==null) {
			root = new Link(c, r);
			root.setLeft(root);
			root.setRight(root);
			root.setHead(root);
			root.setDown(root);
			root.setUp(root);
		} else {
			next = new Link(c,r);
			next.setRight(next);
			next.setLeft(next);
			next.setUp(root);
			next.setHead(root.getHead());
			next.setDown(root.getDown());
			next.getDown().setUp(next);
			root.setDown(next);
			root = next;
		}
		
		
	}
	
	
	
	public boolean searchColumnAndRow(char column, int row) {
		Link temp = root;
		//num is used to limit the amount of searches as its a loop
		for(int j = 0; j < gridLength;j++) {
			if(temp.getColumn() == column) {
				for(int i = 0; i < gridHeight; i++) {
					if(temp.getRow() == row) {
						return true;
					}
					temp = temp.getDown();
				} 
			} else temp = temp.getRight();
		}
		return false;
	}
	
	
	public void moveToHead() {
		root = root.getHead();
	}
	
	public Link moveToStart(Link link) {
		
		link = link.getHead();
		while(link!=null) {
			if(link.getColumn() == 'A') {
				return link;
			} else {
				link = link.getRight();
			}
		}
		return link;
		
	}
	
	public void addLeft() {
		root.setLeft(root.getUp().getLeft().getDown());
		root.setRight(root.getLeft().getRight());
		root.getLeft().setRight(root);
		root.getRight().setLeft(root);
	}
	
	
	public void solve() {
		Link link = this.moveToStart(root);
		for(int col = 0; col < gridLength; col++) {
			
			for(int row = 0; row < gridHeight; row++) {
				
				ArrayList<Integer> tempNumbers = link.getNumbers();
				
				
			}
			
		}
	}
	
	public Boolean checkRow(Link link, int num) {
		
		for(int i = 0; i < gridLength; i++) {
			
		}
		
		
		return true;
	}
	
	
	//Displaying Methods
	
	public void displayWholeGrid() {
		Link temp = this.moveToStart(root);
		//Link temp = root;
		
		for(int j=0;j<gridLength;j++) {
			for(int i=0;i<gridHeight;i++) {
				System.out.print(temp.getColumn());
				System.out.print(temp.getRow() + " ");
				temp = temp.getRight();
			}
			temp = temp.getDown();
			System.out.print("\n");
		}
	}
	
	
	public void displayWholeGridA() {
		Link temp = this.moveToStart(root);
		//Link temp = root;
		
		for(int j=0;j<gridLength;j++) {
			for(int i=0;i<gridHeight;i++) {
				System.out.print(temp.getAnswer());
				temp = temp.getRight();
			}
			temp = temp.getDown();
			System.out.print("\n");
		}
	}
	
	
	
	public void displayItemsRight() {
		Link temp = this.moveToStart(root);
			for(int i=0;i<gridLength;i++) {
			System.out.println(temp.getAnswer());
			temp = temp.getRight();
		}
		
	}
	
	public void displayStringRight() {
		Link temp = root;
		while(temp!= null) {
			System.out.print(temp.getColumn());
			System.out.print(temp.getRow() );
			System.out.print("\n");
			temp = temp.getRight();
		}
		
	}
	
	public void displayStringDown() {
		Link temp = root;
		while(temp!= null) {
			System.out.print(temp.getColumn());
			System.out.print(temp.getRow() );
			System.out.print("\n");
			temp = temp.getDown();
		}
		
	}
	
	
	
	//Testing
	
	
	public void testOne() {
		System.out.println("\nTest One moving from A0 to D3 diagonally");
		Link temp = this.moveToStart(root);
		System.out.println(temp.getColumn() + "" + temp.getRow());
		temp = temp.getRight().getDown();
		System.out.println(temp.getColumn() + "" + temp.getRow());
		temp = temp.getRight().getDown();
		System.out.println(temp.getColumn() + "" + temp.getRow());
		temp = temp.getDown().getRight();
		System.out.println(temp.getColumn() + "" + temp.getRow());
	}
	
	public void testTwo() {
		System.out.println("\nTest Two moving left to right");
		
		Link temp = this.moveToStart(root);
		temp = temp.getLeft().getUp();
		for(int j=0;j<gridLength;j++) {
			for(int i=0;i<gridHeight;i++) {
				System.out.print(temp.getColumn());
				System.out.print(temp.getRow() + " ");
				temp = temp.getLeft();
			}
			temp = temp.getUp();
			System.out.print("\n");
		}
		
	}
	
	public void testThree() {
		System.out.println("\nTest Three search for A6\n");
		System.out.println(this.searchColumnAndRow('A', 6));
	}
	
	public void testFour() {
		Link tempLink = this.moveToStart(root);

		for(int i = 0; i < gridLength; i++) {
			ArrayList<Integer> temp = tempLink.getNumbers();	
			for(int num : temp) {
				System.out.print(num + " ");
			}
			tempLink = tempLink.getRight();
			System.out.println("");
		}
	}
	
	
}
