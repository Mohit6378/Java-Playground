interface Computer {
	void code();
}

class Laptop implements Computer {
	public void code() {
		System.out.println("Coding in Laptop.");
	}
}


class Desktop implements Computer {
	public void code() {
		System.out.println("Coding in Desktop, Faster.");
	}
}


class Developer {
	public void develop(Computer device) {
		device.code();
	}
}

public class PracticeInterface {
	public static void main(String args[]) {
		Computer d1 = new Laptop();
		Developer mohit = new Developer();
		mohit.develop(d1);

		Computer d2 = new Desktop();
		Developer rohit = new Developer();
		rohit.develop(d2);
	}
}

	