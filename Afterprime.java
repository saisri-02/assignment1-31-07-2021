import java.util.*;
public class Afterprime
{
    static int N=100005;
    public static int prime[]=new int[N];
    public static void sieve()
    {
        for(int i=0;i<N;i++)
        {
            prime[i]=i;
        }
        prime[0]=1;
        prime[1]=1;
        for(int x=2;x*x<N;x++)
        {
            if(prime[x]==x)
            {
                for(int i=x*x;i<N;i+=x)
                {
                    prime[i]=x;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int n;
        sieve();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i<=N;i++)
        {
           if(prime[i]==i)
           { 
              System.out.println(i);
              break;
           }
        }
    }
}

output1:
10
11

output2:
121
127