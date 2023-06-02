import java.util.Scanner;
class InputSwap2{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1;
num1=scob.nextInt();
System.out.println("Enter a number:");
int num2;
num2=scob.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After Swapp\n"+num1+"\n"+num2);
}
}