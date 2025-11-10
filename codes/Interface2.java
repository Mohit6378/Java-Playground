interface Batter {
	void batting();
}

interface Bowler {
	void bowling();
}

class AllRounder implements Batter, Bowler {
	public void batting() {
		System.out.println("Hits sixes and fours.");
	}

	public void bowling() {
		System.out.println("Take Hat-tricks.");
	}
}

public class Interface2 {
	public static void main(String[] args) {
		AllRounder jadeja = new AllRounder();
		jadeja.batting();
		jadeja.bowling();
	}
}