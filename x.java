import java.util.*;

public class Solution {

	static HashSet<Long> ans = new HashSet<Long>();
	static HashMap<Long, ArrayList<Long>> factors = new HashMap<Long, ArrayList<Long>>();  

	static ArrayList<Long> divisors(long n) {
		if( factors.containsKey(n)){
			return factors.get(n);
		}
		ArrayList<Long> arr = new ArrayList<Long>();
		for (long i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					arr.add(i);
				} else {
					arr.add(i);
					arr.add(n / i);
				}
			}
		}
		factors.put(n,arr);
		return arr;
	}

	static void doSome(long n, long k) {
		if (k-- == 0 || factors.containsKey(n)) {
			return;
		}
		ArrayList<Long> arr = divisors(n);
		for (long num : arr) {
			long x = num*n;
			ans.add(x);
			doSome(x,k);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long limit = 1000000007;
		int t = sc.nextInt();
		while (t-- > 0) {
			ans.clear();
			long p = 0;
			long n = sc.nextLong();
			long k = sc.nextLong();
			doSome(n, k);
			for(long num: ans){
				p+=num;
				p%=limit;
			}
			System.out.println(p);
		}
	}
}
