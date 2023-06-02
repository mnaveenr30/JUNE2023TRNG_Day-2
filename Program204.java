import java.util.*;
public class Program204{
static int diff(int a,int b){return (a-b);}
static int product(int a,int b){return (a*b);}
static int smallest(int a,int b){
if(a>b)return b;
if(a<b)return a;
return 0;
}
static int largest(int a,int b){
if(a>b)return a;
if(a<b)return b;
return 0;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.println("Enter the first number....");
num1=sc.nextInt();
System.out.println("Enter the second number....");
num2=sc.nextInt();
result=diff(num1,num2);
System.out.println("diff of "+num1+" and "+num2+" is "+result);
result=product(num1,num2);
System.out.println("product of "+num1+" and "+num2+" is "+result);
result=smallest(num1,num2);
System.out.println("smallest of "+num1+" and "+num2+" is "+result);
result=largest(num1,num2);
System.out.println("largest of "+num1+" and "+num2+" is "+result);
}
}




