package Data_structures;

public class DP {
	public static int lcs(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		
		int[][] dp = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				} else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[n][m];
	}
	
	public static void main(String[] args) {
		String s1 = "abcdsdf";
		String s2 = "bcadfghj";
		
		System.out.println(lcs(s1,s2));
	}
}



//public class LCSubstring {
//    public static int findLCS(String s1, String s2) {
//        int m = s1.length();
//        int n = s2.length();
//        int[][] dp = new int[m+1][n+1];
//        
//        int max=-1;
//        
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (s1.charAt(i-1) == s2.charAt(j-1)) {
//                    dp[i][j] = dp[i-1][j-1] + 1;
//                } else {
//                    dp[i][j] = 0;
//                }
//                
//                
//                max=Math.max(dp[i][j], max);
//            }
//        }
//        
//        return max;
//    }
//
//    public static void main(String[] args) {
//        String s1 = "ABCD";
//        String s2 = "ACEF";
//        int lcs = findLCS(s1, s2);
//        System.out.println("Length of LCS is " + lcs);
//    }
//}