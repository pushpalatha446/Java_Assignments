/**
 * Created by pdumpala on 5/18/16.
 */
import java.io.*;
public class AsteriskRow {
    public static void main(String[] args) throws IOException {
        int index, N;
        BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter limit>>");
        N=Integer.parseInt(b.readLine());
        for(index=0;index<N;index++){
            System.out.print("*");
        }
        System.out.println();
    }
}