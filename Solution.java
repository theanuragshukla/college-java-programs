import java.util.*;

class Solution {
	HashMap<String, Integer> m = new HashMap<String, Integer>();
	int hash(int a , int b){
		return (a+b)*(a+b+1)/2 + a;
	}
	int min =(int) Integer.MAX_VALUE;
	void traverse(int[][] grid, int sum, int x, int y, int m , int n){
		if(x>=m || y>=n){
			return;
		}
		Integer key = Integer.valueOf(hash(sum, hash(x, y)));
		System.out.println(key.toString().getClass().getName());
		System.out.println(m.containsKey(key.toString()));
		sum+=grid[x][y];

		if(x==m-1 && y==n-1){
			if(sum < min)
				min = sum;
			return;
		}
		traverse(grid, sum, x+1, y, m, n);
		traverse(grid, sum, x, y+1, m, n);
		return;    
	}
	public int minPathSum(int[][] grid) {
		traverse(grid, 0, 0, 0, grid.length, grid[0].length);
		return min;
	}

}
