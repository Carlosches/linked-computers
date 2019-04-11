package model;

public class Computer {
	
	
	private int hd;
	private int ram;
	
	private String ip;
	
	private Computer next;
	private Computer previous;
		

	public Computer(int hd, int ram, String ip) {
		this.hd = hd;
		this.ram = ram;
		this.ip = ip;
	}


	public void setHd(int hd) {
		this.hd = hd;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public void setNext(Computer next) {
		this.next = next;
	}


	public void setPrevious(Computer previous) {
		this.previous = previous;
	}
	
	
	
	
	
	
	
}
