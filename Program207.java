import java.util.*;
public class Program207{
public static void main(String args[]){
char ch;
System.out.println("Enter your CHARACTER :");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int a=ch;//or int a=(int)ch;
System.out.println("ASSCIE value of "+ch+" is "+a);
}
}