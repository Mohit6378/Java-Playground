class EnumExample {     //make class public to access enum w/o class name
	enum Signal {
		RED, YELLOW, GREEN;
	}
}

public class Enum4 {
	public static void main(String[] args) {
		EnumExample.Signal s = EnumExample.Signal.RED; 
		System.out.println("Signal is: " + s);
	}
}