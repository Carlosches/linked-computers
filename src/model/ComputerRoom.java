package model;

public class ComputerRoom {
	
	private static Computer first;
	
	public static void invertList() {
		
		Computer current = first;
		
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		Computer curr2 = current;
		while(curr2.getPrevious() != null) {
			Computer p = curr2.getPrevious();
			
			curr2.setPrevious(curr2.getNext());
			curr2.setNext(p);
			
			curr2 = curr2.getNext();
			
		}
		Computer p = curr2.getPrevious();
		
		curr2.setPrevious(curr2.getNext());
		curr2.setNext(p);
		first = current;
	}
	
	public static void main(String[] args) {
		
		Computer n =  new Computer(1,1 , "segundo",null, null);
		
		first = new Computer(1,1 , "primero",null, null);
		
		n.setPrevious(first);
		first.setNext(n);
		Computer current = first;
		while(current != null) {
			System.out.println(current.getIp());
			
			current = current.getNext();
		}
		
		invertList();
		
		
		 current = first;
		while(current != null) {
			System.out.println(	current.getIp());
			current = current.getNext();
		}
		
	}
}
