package model;

public class Computer {
	
	
	private int hd;
	private int ram;
	
	private String ip;
	
	private Computer next;
	private Computer previous;
		

	public Computer(int hd, int ram, String ip, Computer next, Computer previous) {
		this.hd = hd;
		this.ram = ram;
		this.ip = ip;
		this.next = next;
		this.previous = previous;
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


	public int getHd() {
		return hd;
	}


	public int getRam() {
		return ram;
	}


	public String getIp() {
		return ip;
	}


	public Computer getNext() {
		return next;
	}


	public Computer getPrevious() {
		return previous;
	}
	
	
	
	
	
	
	
}
