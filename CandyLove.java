import java.util.*;

public class CandyLove {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int t = in.nextInt();

        while (t-- > 0){
        int n = in.nextInt();
        int []a = new int[n];

        int sum = 0;
        
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
            sum += a[i];
        }
        
        

        if (sum % 2 == 0){
            System.out.println("NO");
        }
        else
            System.out.println("YES");
            
        }
    }
}
