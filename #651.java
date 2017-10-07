public class Test{
	public static void main(String[] args){
		int[] a = maxA(50);
		for(int i=0;i<a.length;i++){
			System.out.println(i+" "+a[i]);
		}
	}
	public static int max(int n) {
		int[] dp = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			dp[i] = i;
			for (int j = 1; j <= i - 3; j++)
				dp[i] = Math.max(dp[i], dp[j] * (i - j - 1));
		}
		return dp[n];
	}

	public static int[] maxA(int n) {
		int[] dp = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			dp[i] = i;
			for (int j = 1; j <= i - 3; j++)
				dp[i] = Math.max(dp[i], dp[j] * (i - j - 1));
		}
		return dp;
	}
}