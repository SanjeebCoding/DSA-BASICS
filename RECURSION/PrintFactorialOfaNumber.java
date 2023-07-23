import java.util.Scanner;

public class PrintFactorialOfaNumber {
    public static int calFactoiral(int n)
    {
        if(n==1 & n==0)
        {
            return 1;
        }
        int fact_nm1 = calFactoiral(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
        

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any natural number :");
        int n=sc.nextInt();
        System.out.println(calFactoiral(n));
    }
}
