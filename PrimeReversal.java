import java.util.*;

public class PrimeReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
		int t = in.nextInt();
        while (t-- > 0) {
		    int n = in.nextInt();
		    String a = in.next();
		    String b = in.next();

            if (a == b){
                System.out.println("Yes");
            }

            int count = 0;
            boolean flag = false;
            int temp = n - 1;
            int i = 0;
            int  j = n - 1; 
            while (temp-- > 0){
                if (a.charAt(i) == b.charAt(j)){
                    count++;
                }
                else {
                    if (isPrime(count)){
                        flag = true;
                        break;
                    }
                    count = 0;
                }
                
                
            }

            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
		}
    }

    public static boolean isPrime(int a) {
        boolean f = true;
        for (int i = 2; i < a; i++)
            if (a % i == 0)
                f = false;
        return f;
    }
}
