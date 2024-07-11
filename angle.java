import java.util.*;
class angle
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int a,b,c;
System.out.println("enter angle a");
a=sc.nextInt();
System.out.println("enter angle b");
b=sc.nextInt();
System.out.println("enter angle c");
c=sc.nextInt();
if(a+b+c==180)
{
System.out.println("it is triangle");
}
else
{
System.out.println("it is not triangle");
}
}
}