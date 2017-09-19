import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(missingNumber(new int[]{0,1,3}));
	}
	public int islandPerimeter(int[][] grid) {
		int lenX = grid[0].length;
		int lenY = grid.length;
		int[][] newArr = new int[lenY+2][lenX+2];
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				newArr[i+1][j+1] = grid[i][j];
			}
		}
		int sum = 0;
		for(int i=1;i<newArr.length-1;i++){
			for(int j=1;j<newArr[i].length-1;j++){
				if(newArr[i][j]==1){
					if(newArr[i-1][j]==0){
						sum++;
					}
					if(newArr[i+1][j]==0){
						sum++;
					}if(newArr[i][j-1]==0){
						sum++;
					}if(newArr[i][j+1]==0){
						sum++;
					}
				}
			}
		}
		return sum;
	}
		
}