public class ToweroFHanoi
{
    public static void toweroFHanoi(int n,String src,String help,String dest)
    {
        if(n==1)
        {
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        return;
        }
        toweroFHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        toweroFHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        toweroFHanoi(n,"S","H","D");
    }
}