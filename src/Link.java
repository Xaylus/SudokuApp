import java.util.ArrayList;
import java.util.List;

public class Link {

	private int answer;
	int[] array = {1,2,3,4,5,6,7,8,9};
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private char column;
	private int row;
	private Link right;
	private Link left; 
	private Link up;
	private Link down;
	private Link head; // This is a Link to the top row link e.g. A0 or C0
	
	
	public Link() {
		this.right = null;
		this.left = null;
		this.up = null;
		this.down = null;
		this.activateNumbersList();
		
	}
	
	public Link(int item){
		this.answer = item;
		this.right = null;
		this.left = null;
		this.up = null;
		this.down = null;
		this.activateNumbersList();
	}
	
	public Link(char c, int r){
		//this.answer = num;
		this.column = c;
		this.row = r;
		this.right = null;
		this.left = null;
		this.up = null;
		this.down = null;
		this.activateNumbersList();
	}
	
	public Link(int item, Link list){
		this.answer = item;
		this.right = list;
		this.left = null;
		this.up = null;
		this.down = null;
		this.activateNumbersList();
	}
	

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int data) {
		this.answer = data;
	}
	
	public char getColumn() {
		return column;
	}
	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	public Link getRight() {
		return right;
	}

	public void setRight(Link right) {
		this.right = right;
	}

	public Link getLeft() {
		return left;
	}

	public void setLeft(Link left) {
		this.left = left;
	}

	public Link getUp() {
		return up;
	}

	public void setUp(Link up) {
		this.up = up;
	}

	public Link getDown() {
		return down;
	}

	public void setDown(Link down) {
		this.down = down;
	}
	
	public Link getHead() {
		return head;
	}

	public void setHead(Link head) {
		this.head = head;
	}
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public void activateNumbersList() {
		for(int num : array) {
			this.numbers.add(num);
		}
	}
	
	
}
