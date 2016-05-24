/**
 * Created by pdumpala on 5/18/16.
 */
import java.io.*;
public class IsoscelesTriangle {
    public static void main(String[] args)throws IOException{
        int row,col,length,k;
        BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length of the side>>");
        length=Integer.parseInt(b.readLine());
        for(row=1;row<=length;row++){
            for(k=row;k<length;k++)
                System.out.print(" ");
            for(col=1;col<(2*row);col++)
                System.out.print("*");
            System.out.println();
            }
        }
    }
