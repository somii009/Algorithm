import java.io.*;
import java.util.*;

public class BOJ_2293 {
    static int n, k;
    static int[] coin, dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        coin = new int[n];
        dp = new int[k+1];

        for(int i=0; i<n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 1;
        for(int i=0; i<n; i++){
            for(int j=coin[i]; j<= k; j++) {
                dp[j] += dp[j-coin[i]];
            }
        }

        System.out.println(dp[k]);
    }
    
}