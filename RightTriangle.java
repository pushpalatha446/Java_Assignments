/**
 * Created by pdumpala on 5/18/16.
 */
import java.io.*;
public class RightTriangle {
    public static void main(String[] args)throws IOException{
        int row,col,n;
        BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter limit>>");
        n=Integer.parseInt(b.readLine());
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
