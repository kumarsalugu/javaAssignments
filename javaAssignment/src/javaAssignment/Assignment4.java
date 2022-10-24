package javaAssignment;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j == 0 && i > (n-1)/2 || i == n-1 || j == n-1 && i > (n-1)/2 || i -j >= (n-1)/2 || i + j >= (3*(n-1)/2)|| i == n-2 && j == (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
