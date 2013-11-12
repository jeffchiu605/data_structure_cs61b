package day5;

public class forLoop {
	
	public void main forloops() {
	for (int k = 0; k < 10; k++) {
		System.out.println(k);
	}
}
	int row = 0;
	while (row < 10) {
		int col = 0;
		while (col <= row) {
			System.out.print( '*');
			col = col + 1;
		}
	}row = row + 1;
	System.out.println ( );
	
	for (int row = 0; row < 10; row = row + 1){
		for (int col = 0; col <= row; col = col + 1) {
			System.out.print('*');
		}
		System.out.println ( );
	}
}
