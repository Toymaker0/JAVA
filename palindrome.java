import java.io.*;
import java.util.Scanner;
public class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
 System.out.println ("Enter the number ");
int rem,rev=0,temp,n;
temp=sc.nextInt();
n=temp;
while(n>0){
    rem=n%10;
    rev=(rev*10)+rem;
    n=n/10;
}
if (temp==rev)
System.out.println("Its a palindrome");
else
System.out.println("Its not a palindrome");
}
}