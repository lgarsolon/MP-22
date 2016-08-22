import java.util.Scanner;


public class RuleThirtyLovely {

	public static void main(String[] args) {
		String size;
        System.out.println("Please enter size: ");
        Scanner scanIn = new Scanner(System.in);//scans the size of the array
        size = scanIn.nextLine();
        int x = Integer.parseInt(size);
        int grid[][];
		grid = new int[x][x];
        int seed = (x / 2);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i == 0 && j == seed) { //Fill the seed with 1
					grid[i][j] = 1;
				} else if ((i == 0) && !(i == 0 && j == seed)) { //Determines if the element is in the first line
					grid[i][j] = 0;
				}
				else if ((i > 0 && j == 0) || (i < (x-1) && j == 0)) { //Checks if the element is in the leftmost part
					if ((grid[i-1][j] == 1 && grid[i-1][j+1] == 1) || 
						(grid[i-1][j] == 1 && grid[i-1][j+1] == 0) ||
						(grid[i-1][j] == 0 && grid[i-1][j+1] == 1)) {
						grid[i][j] = 1;
					} else if (grid[i-1][j] == 0 && grid[i-1][j+1] == 0) {
						grid[i][j] = 0;
					}
				} else if ((i > 0 && j == (x-1)) || (i < (x-1) && j == (x-1))) { //Checks if the element is in the rightmost part
					if ((grid[i-1][j-1] == 1 && grid[i-1][j] == 0) ||
						(grid[i-1][j-1] == 0 && grid[i-1][j] == 1)) {
						grid[i][j] = 1;
					} else if ((grid[i-1][j-1] == 1 && grid[i-1][j] == 1) ||
						(grid[i-1][j-1] == 0 && grid[i-1][j] == 0)) {
						grid[i][j] = 0;
					}
				} else { //element is in the middle part
					if ((grid[i-1][j-1] == 1 && grid[i-1][j] == 0 && grid[i-1][j+1] == 0) ||
						(grid[i-1][j-1] == 0 && grid[i-1][j] == 1 && grid[i-1][j+1] == 1) ||
						(grid[i-1][j-1] == 0 && grid[i-1][j] == 1 && grid[i-1][j+1] == 0) ||
						(grid[i-1][j-1] == 0 && grid[i-1][j] == 0 && grid[i-1][j+1] == 1)) {
						grid[i][j] = 1;
				    } else if ((grid[i-1][j-1] == 1 && grid[i-1][j] == 1 && grid[i-1][j+1] == 1) ||
						(grid[i-1][j-1] == 1 && grid[i-1][j] == 1 && grid[i-1][j+1] == 0) ||
						(grid[i-1][j-1] == 1 && grid[i-1][j] == 0 && grid[i-1][j+1] == 1) ||
						(grid[i-1][j-1] == 0 && grid[i-1][j] == 0 && grid[i-1][j+1] == 0)) {
						grid[i][j] = 0;
				    }
				}
			}
		}
		for(int k = 0; k < x; k++) { //prints the final elements of the two dimensional array
			for(int l = 0; l < x; l++){
				//System.out.print(grid[k][l]);
				System.out.print(grid[k][l] + " ");
			}
			System.out.print("\n");
		}
    }
}