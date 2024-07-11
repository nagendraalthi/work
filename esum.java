import java.util.*;
class enum
{
public static void main(String args[])
{
int i=1,n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
n=sc.nextInt();
while(i<=n)
{
if(n%i==0)
sum=sum+i;
System.out.println(+sum);
}
i++;
}
}
