/**
 * Created by pdumpala on 5/19/16.
 */
import java.io.*;
public class DiamondWithName {
    public static void main(String[] args)throws IOException{
        int row,col,length,k;
        System.out.print("Enter the side length>>");
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        length=Integer.parseInt(b.readLine());
        for(row=1;row<length;row++){
            for(k=row;k<length;k++)
                System.out.print(" ");
            for(col=1;col<(2*row);col++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("Pushpa");
        for(row=(length-1);row>=1;row--){
            for(k=row;k<length;k++)
                System.out.print(" ");
            for(col=1;col<(2*row);col++)
                System.out.print("*");
            System.out.println();
        }
    }
}

