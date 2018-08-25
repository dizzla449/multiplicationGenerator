package multiplicationTable;
import java.util.Scanner;

public class progs4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final String COL_SEPERATOR = "|";
		final String ROW_SEPERATOR = "----";
		final String INTERSECTION = "+";
		
		System.out.print("Enter n: ");
		while (input.hasNext()) {
			
			int n = input.nextInt();
			
			System.out.format("  *%s ", COL_SEPERATOR);
			for (int i =1; i<=n; i++) {
				System.out.format("%3d ", i);
				System.out.print(COL_SEPERATOR);
			}
			System.out.println();
			
			for (int i=1; i<=n; i++) {
				
				
				for( int j=0; j<=n; j++) {
					System.out.print(ROW_SEPERATOR);
					if (j<n) {
					System.out.print(INTERSECTION);
					} else {System.out.print("-");}
				}
				System.out.println();
				
				System.out.format("%3d %s", i, COL_SEPERATOR);
				for (int k=1; k<=n; k++) {
					System.out.format("%3d %s",k*i, COL_SEPERATOR);
				}
				System.out.println();
			}
			System.out.print("Enter n: ");
		}
	}

}
