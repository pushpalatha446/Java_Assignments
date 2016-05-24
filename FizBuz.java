/**
 * Created by pdumpala on 5/19/16.
 */
public class FizBuz {
    public void FizzBuzz(){
        int i;
        for(i=1;i<=100;i++){
               if(i%3==0)
                   if(i%5==0)
                       System.out.println("FizzBuzz");
                    else
                       System.out.println("Fizz");
                else if(i%5==0)
                   System.out.println("Buzz");
                else
                   System.out.println(i);
        }
    }
    public static void main(String[] args){
        FizBuz F=new FizBuz();
        F.FizzBuzz();
    }
}
