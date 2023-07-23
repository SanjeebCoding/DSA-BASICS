import java.util.Scanner;

import javax.lang.model.util.Elements;

public class PowerOfNumber {
    public static int findPower(int a,int b)
    {
        int mid = 0,result =0,finalResult = 0;
        
        //base case condition
        if(b==1)
        return a;

        //Recursive call
        else
        {
            mid = b/2;
            result = findPower(a, mid);
            finalResult = result*result;

            if(b % 2 ==0)
            return finalResult;

            else
            return a*finalResult;
        } 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = findPower(a, b);
        System.out.println("a ^ b = "+result);

    }
}
