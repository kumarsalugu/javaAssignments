package javaAssignment;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		
		for (int i = 0; i < n; i++) {
			
			//letter I
			
			for (int j = 0; j < n; j++) {
				if(j == n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//letter N
			
			for (int j = 0; j < n; j++) {
				if(j == 0 || j == n-1 || i == j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}		
			}
			
			for (int j = 0; j < n/4; j++) {
				System.out.print(" ");
			}
			//letter E
			
			for (int j = 0; j < n; j++) {
				if(j == 0 || (i == 0 || i == n-1) && j < (5*n)/6 || i == (n-1)/2 && j <(3*n)/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//letter U
			
			for (int j = 0; j < n; j++) {
				if(j== 0 && i < n-1 || i == n-1 && j>0 && j<(5*n)/6|| j == (5*n)/6 && i < n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//letter R
			
			for (int j = 0; j < n; j++) {
				if(j == 0 || i == 0 && j<(5*n)/6 || i == (n-1)/2 && j< (5*n)/6 || i==j && i>(n-1)/2 && j>(n-1)/2 || j== (5*n)/6 && i<(n-1)/2 && i > 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//space
			for (int j = 0; j < n/4; j++) {
				System.out.print(" ");
			}
			//letter O
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j<(3*n)/4 && j > 0) || (i == n-1 && j<(3*n)/4 && j > 0) ||
						(j == 0 && i > 0 && i < n-1) || (j==(3*n)/4 && i > 0 && i < n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//letter N
			for (int j = 0; j < n; j++) {
				if(j == 0 || j == n-1 || i == j) {
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
