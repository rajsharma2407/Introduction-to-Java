package exceptionHandling;

import java.util.Scanner;

public class EH {

    public void div(int x, int y) throws ArithmeticException{
        try{
            System.out.println(x/y);

        }catch (Exception err){
         throw err;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{

            EH obj = new EH();
            obj.div(2,0);
        }catch (ArithmeticException err){
            System.out.print(err);
        }
    }
}
