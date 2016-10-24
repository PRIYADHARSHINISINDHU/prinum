import java.io.*;
import java.util.*;
class pn
{
public static void main(String[] args)
{
int n,count=0,i;
try
{
Scanner s=new Scanner(System.in);
System.out.print("The number is:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}

}
if(count==2)
{
System.out.println("The number is prime number");
}
else
{
System.out.println("The number is not a prime number");
}
}
catch(Exception e)
{
}
}
}
