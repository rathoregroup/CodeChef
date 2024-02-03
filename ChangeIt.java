import java.util.*;

public class ChangeIt {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int []  a = new int[n];
            
            for (int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            
            int max = 0;
            for (int i = 1; i < n; i++){
                int c = 0;
                for (int j = i - 1; j < n; j++){
                    if (a[i] == a[j]) {
                        c++;
                    }
                }
                max = Math.max(max, c);
            }
            System.out.println(n - max);
            
        }
    }
}
