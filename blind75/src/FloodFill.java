
public class FloodFill {
	public static void main(String args[]) {
		
		int arr[][] = { { 1, 1, 1 }, 
						{ 1, 1, 0 }, 
						{ 1, 0, 1 } };
		
		int sr =1;
		int sc=1;
		int rows = 3;
		int columns = 3;
		int colour = 2;
		int sourceCellValue = arr[sr][sc];
		
		if(colour == sourceCellValue) {
			return;
		}
		
		depthFirstSearch(arr, sr, sc, rows, columns, colour, sourceCellValue);
		
		for(int i =0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}			
	}
	
	public static void depthFirstSearch(int arr[][], int sr, int sc, int rows, int columns, int colour, int sourceCellValue) {
		
		if(sr < 0 || sc < 0 || sr >= rows || sc >= columns) {
			return;
		}
		else if(arr[sr][sc] != sourceCellValue) {
			return;			
		}
		
		arr[sr][sc] = colour;
		
		depthFirstSearch(arr, sr-1, sc,rows,columns,colour,sourceCellValue); //TOP
		depthFirstSearch(arr, sr+1, sc,rows,columns,colour,sourceCellValue); //BOTTOM
		depthFirstSearch(arr, sr, sc-1,rows,columns,colour,sourceCellValue); //LEFT
		depthFirstSearch(arr, sr, sc+1,rows,columns,colour,sourceCellValue); //RIGHT	
	}
}
