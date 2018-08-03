package Dpalgorithm;

public class Find_Sub_Set_Sum_Equal_To_K {

	public static void main(String[] args) {

		/*
		 * this is implementation part of the subset sum equal to k using dynamic
		 * programming approach
		 */
		int A[] = { 5, 4, 3, 2, 6 };
		int sum = 21;
		System.out.println(find(A,sum));
		

	}

	public static boolean find(int[] A, int sum) {
		boolean[][] solution = new boolean[A.length + 1][sum + 1];

		for (int i = 1; i <= sum; i++) {
			solution[0][i] = false;
		}
		for (int j = 0; j <= A.length; j++) {
			solution[j][0] = true;
		}

		for (int i = 1; i <= A.length; i++) {
			for (int j = 0; j <= sum; j++) {

				solution[i][j] = solution[i - 1][j];

				if (solution[i][j] == false && j>= A[i - 1]) {
					solution[i][j] = solution[i - 1][j - A[i - 1]];
				}
			}

		}
		
		//element traversal
		int temp=sum;
		int row=A.length;
		int col=sum;
		
		if(solution[row][col]==true) {
			while(temp!=0) {
				while(solution[row-1][col]==!false && row>0 ) {
					row=row-1;
				}
				System.out.print(A[row-1]+" ");
				temp=temp-A[row-1];
				col=temp;
				row=A.length;
			}
			
			
			
		}
		else
			System.out.println("no solution exist");
		

		return solution[A.length][sum];
	}

}
