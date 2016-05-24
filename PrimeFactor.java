/**
 * Created by pdumpala on 5/19/16.
 */
import java.io.*;
public class PrimeFactor {
    public static void main(String[] args) throws IOException{
        int N;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number>>");
        N=Integer.parseInt(b.readLine());
        PrimeFactor PF=new PrimeFactor();
        PF.generate(N);
    }
    public void generate(int n) {
        int i, j;
        boolean prime;
        for (i = 2; i < n; i++) {
            if (n%i == 0) {
                prime = true;
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
}