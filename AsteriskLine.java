/**
 * Created by pdumpala on 5/18/16.
 */
import java.io.*;
public class AsteriskLine {
    public static void main(String[] args) throws IOException{
        int index, N;
        BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter limit>>");
        N=Integer.parseInt(b.readLine());
        for(index=0;index<N;index++){
            System.out.println("*");
        }
    }
}
