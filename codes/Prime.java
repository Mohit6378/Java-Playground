//Program to print prime numbers upto 500.

public class Prime {
	public static void main(String args[]) {
		int count=0;
		
		for(int i = 2; i <=500; i++) {
			for(int j =2; j <= i ; j++) {
				if(i%j == 0 && j < i)
					break;
				else if(j == i) {
					System.out.print(i+"  ");
					count++;
					if(count % 5 == 0)
						System.out.println();
				}
			}
		}
	}
}	