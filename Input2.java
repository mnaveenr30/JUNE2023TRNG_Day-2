import java.util.Scanner;
class Input2{
public static int add(int a,int b){
int c=a+b;
int d=a*b;
int e=a/b;
int f=a%b;
int g=a-b;
System.out.println(a+"+"+b+"="+c);
System.out.println(a+"-"+b+"="+g);
System.out.println(a+"*"+b+"="+d);
System.out.println(a+"/"+b+"="+e);
System.out.println(a+"%"+b+"="+f);
return 0;
}
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1;
num1=scob.nextInt();
System.out.println("Enter a number:");
int num2;
num2=scob.nextInt();
add(num1,num2);
}
}