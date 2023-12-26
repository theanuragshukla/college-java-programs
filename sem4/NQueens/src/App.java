import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       int n = 4;
       int [][] arr = new int [n][n];
       List<List<Integer>> ret = new ArrayList<>();
       System.out.println(placeQueens(arr, n, 0, 0, ret)); 
    }

    public static boolean isSafe(int[][] arr, int n, int x, int y){
        int i, j;
        for(i=0; i<y; i++)if(arr[x][i]==1)return false;
        for(i = x, j=y; i>=0 && j>=0; i--, j--)if(arr[i][j]==1)return false;
        for(i=x, j=y; i<=n && j>=0; i++, j--)if(arr[i][j]==1)return false;
        return true;
    }

    public static List<List<Integer>> placeQueens(int [][] arr, int n , int x, int y, List<List<Integer>> ret){
        List<Integer> ans = new ArrayList<>();
        if(x>=n || y>=n ){
            return ret;
        }
        arr[x][y] = 1;
        if(!isSafe(arr,n, x, y)){
            return (placeQueens(arr,n , x, y+1, ret));
        }else{
            ans.add(x);
            ans.add(y);
        }
        ret.add(ans);
        return placeQueens(arr, n-1,  x+1, y, ret);
    }
}
