import java.util.*;

public class EasyPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();

            for (int i = n; i >= 1; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
