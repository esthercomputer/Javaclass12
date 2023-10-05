import java.util.*;
public class Main
{
	public static void main(String[] args) {
int a, b; char c; int res=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Enter an arithmetic operator");
c = sc.next().charAt(0);
switch (c)
{
    case '+':
        res=a+b;
    break;
    case '-':
        res=(a>b)?a-b:b-a;
    break;
    case '*':
        res=a*b;
    break;
    case '/':
        res=a/b;
    break;
    case '%':
    res=a%b;
    break;
    default : 
    System.out.println("Invalid");

}
System.out.println("The result is " +res);
	
	
		
		
	}
}
